/**
 * 
 */
package com.ws.codegen.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;

import com.ws.codegen.AbstractJavaCodeTemplate;
import com.ws.codegen.AccessModifier;
import com.ws.codegen.javameta.Attribute;
import com.ws.codegen.javameta.Class;
import com.ws.codegen.javameta.Method;
import com.ws.codegen.velocity.VelocityTest;
import com.ws.util.db.ResolveJavaType;
import com.ws.util.velocity.WSVelocityEngine;

/**
 * @author ranjeet
 * Generate two classes for given table
 * <tablename>BaseVO.java 
 * <tablename>VO.java
 *
 */
public class VOCodeGen extends AbstractJavaCodeTemplate {
	
	public final String packagePath = "com.ws.data.";
	public String fullPackagePath;
	public String className;
	public String baseClassName;
	public final Table table;
	public final String path;
	Class voBaseClass;
	Class voClass;

	public VOCodeGen(Table table) {
		voBaseClass = new Class();
		voClass = new Class();
		this.table = table;
		fullPackagePath = packagePath + table.getName().toLowerCase();
		char[] tableName = table.getName().toCharArray();
		tableName[0] = Character.toUpperCase(tableName[0]);
		className = (new String(tableName)) + "VO";
		baseClassName = (new String(tableName)) + "BaseVO";
		path = resolvePath(fullPackagePath);
		//generate base class
		generateBaseClass();
		setClass(voBaseClass);
		setMainComment("Please do not change anything in this class. " +
				"\n * All changes may be done in " + baseClassName);
		setPackage(fullPackagePath);
		setAuthor(null);
		VelocityTest.genCode(super.codeGenMap, path, baseClassName);
		
		//generate Child class
		generateClass();
		setClass(voClass);
		setMainComment("Please change this class for customizations");
		setPackage(fullPackagePath);
		setAuthor(null);
		VelocityTest.genCode(super.codeGenMap, path, className);
	}
	
	private String resolvePath(String classPath) {
		return classPath.replace('.', '/');
	}
	
	private void generateBaseClass() {
		voBaseClass.setName(baseClassName);
		voBaseClass.setExtendsClassPath(null);
		ArrayList<Attribute> attrList = new ArrayList<Attribute>();
		Iterator<TableColumn> colList = table.getColumns().iterator();
		while (colList.hasNext()) {
			TableColumn col = colList.next();
			Attribute attr = new Attribute();
			attr.setHasGetter(true);
			attr.setHasSetter(true);
			attr.setName(col.getName());
			attr.setJavaType(ResolveJavaType.resolveJavaType(col.getType()));
			attr.setJavaTypeImportString(ResolveJavaType.resolveJavaType(col.getType()));
			attr.setModifier(AccessModifier.PRIVATE);
			attrList.add(attr);
		}
		voBaseClass.setAttributes(attrList);
		voBaseClass.addMethod(generateCompareToMethod());
		voBaseClass.addMethod(generateEquals());
	}

	private void generateClass() {
		voClass.setName(className);
		voClass.setExtendsClassPath(fullPackagePath + baseClassName);
	}
	
	
	private Method generateCompareToMethod() {
		ArrayList<Attribute> inList = new ArrayList<Attribute>();
		Attribute in = new Attribute();
		in.setName("in" + baseClassName);
		in.setJavaType(baseClassName);
		in.setJavaTypeImportString(null);
		in.setModifier(null);
		in.setStatic(false);
		inList.add(in);
		
		Method method = new Method();
		method.setFinal(false);
		method.setJavaType("int");
		method.setName("compareTo");
		method.setModifier(AccessModifier.PUBLIC);
		method.setParams(inList);
		method.setBody("");
		return method;
	}

	private Method generateEquals() {
		ArrayList<Attribute> inList = new ArrayList<Attribute>();
		Attribute in = new Attribute();
		in.setName("in" + baseClassName);
		in.setJavaType(baseClassName);
		in.setJavaTypeImportString(null);
		in.setModifier(null);
		in.setStatic(false);
		inList.add(in);
		
		Method method = new Method();
		method.setFinal(false);
		method.setJavaType("boolean");
		method.setName("equals");
		method.setModifier(AccessModifier.PUBLIC);
		method.setParams(inList);
		List<TableColumn> pkCols = table.getPrimaryColumns();
		StringBuffer body = new StringBuffer();
		for (int i = 0; i < pkCols.size(); i++) {
			TableColumn pkCol = pkCols.get(i);
			body.append("");
			body.append("if (this.get" +  + ")");
		}
		method.setBody("");
		return method;
	}
}
