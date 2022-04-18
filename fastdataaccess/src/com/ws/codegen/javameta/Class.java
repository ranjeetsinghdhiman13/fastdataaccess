package com.ws.codegen.javameta;

import java.util.ArrayList;

import com.ws.codegen.AccessModifier;

public class Class {
	private String name;
	private AccessModifier modifier;
	private String extendsClassPath;
	private ArrayList<Attribute> attributes;
	private ArrayList<Method> methods;
	/**
	 * This can be set to VO, DAO, TestCase etc.
	 */
	private String classType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AccessModifier getModifier() {
		return modifier;
	}
	public void setModifier(AccessModifier modifier) {
		this.modifier = modifier;
	}
	public String getExtendsClassPath() {
		return (extendsClassPath == null) ? "java.lang.Object" : extendsClassPath;
	}
	public void setExtendsClassPath(String extendsClassPath) {
		this.extendsClassPath = extendsClassPath;
	}
	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}
	public ArrayList<Method> getMethods() {
		return methods;
	}
	public void setMethods(ArrayList<Method> methods) {
		this.methods = methods;
	}
	public void addMethod(Method method) {
		if (methods == null) {
			methods = new ArrayList<Method>();
		}
		methods.add(method);
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
}
