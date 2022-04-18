package com.ws.codegen.javameta;

import java.util.ArrayList;

import com.ws.codegen.AccessModifier;

public class Method {
	private String name;
	private String javaType;
	private String javaTypeImportString;
	private String modifier;
	private boolean isStatic;
	private boolean isFinal;
	private boolean isThrows;
	private ArrayList<Attribute> params;
	private ArrayList<Attribute> localParams;
	private ArrayList<Attribute> throwsClasses;
	private String body;
	
	public String getMethodDef() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getModifier() + " ");
		if (this.isStatic)
			buffer.append("static ");
		if (this.isFinal)
			buffer.append("final ");
		buffer.append(this.getJavaType() + " ");
		buffer.append(this.getName() + "( ");
		if (getParams() != null && getParams().size() > 0) {
			for (int i = 0; i < getParams().size(); i++) {
				Attribute attr = getParams().get(i);
				buffer.append("\n\t\t" + attr.getJavaType() + " " + attr.getName());
				if (i < (getParams().size() - 1))
					buffer.append(",");
			}
		}
		buffer.append(this.getName() + ") ");
		if (getThrowsClasses() != null && getThrowsClasses().size() > 0) {
			buffer.append("\n\tthrows ");
			for (int i = 0; i < getThrowsClasses().size(); i++) {
				Attribute attr = getThrowsClasses().get(i);
				buffer.append(attr.getJavaType() + " " + attr.getName());
				if (i < (getParams().size() - 1))
					buffer.append(",");
			}
		}
		return buffer.toString();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJavaType() {
		return javaType;
	}
	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}
	public String getJavaTypeImportString() {
		return javaTypeImportString;
	}
	public void setJavaTypeImportString(String javaTypeImportString) {
		this.javaTypeImportString = javaTypeImportString;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public boolean isStatic() {
		return isStatic;
	}
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	public ArrayList<Attribute> getParams() {
		return params;
	}
	public void setParams(ArrayList<Attribute> params) {
		this.params = params;
	}
	public ArrayList<Attribute> getLocalParams() {
		return localParams;
	}
	public void setLocalParams(ArrayList<Attribute> localParams) {
		this.localParams = localParams;
	}
	public ArrayList<Attribute> getThrowsClasses() {
		return throwsClasses;
	}
	public void setThrowsClasses(ArrayList<Attribute> throwsClasses) {
		this.throwsClasses = throwsClasses;
	}
	public boolean isThrows() {
		return isThrows;
	}
	public void setThrows(boolean isThrows) {
		this.isThrows = isThrows;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
