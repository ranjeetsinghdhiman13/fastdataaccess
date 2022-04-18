package com.ws.codegen.javameta;

import com.ws.codegen.AccessModifier;

public class Attribute {
	private String name;
	private String javaType;
	private String javaTypeImportString;
	private boolean hasGetter;
	private boolean hasSetter;
	private String modifier;
	private boolean isStatic;
	private boolean isFinal;
	
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
	public boolean isHasGetter() {
		return hasGetter;
	}
	public void setHasGetter(boolean hasGetter) {
		this.hasGetter = hasGetter;
	}
	public boolean isHasSetter() {
		return hasSetter;
	}
	public void setHasSetter(boolean hasSetter) {
		this.hasSetter = hasSetter;
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
	public String getCapitalisedName() {
		char[] capName = name.toCharArray();
		capName[0] = Character.toUpperCase(capName[0]);
		return new String(capName);
	}
}
