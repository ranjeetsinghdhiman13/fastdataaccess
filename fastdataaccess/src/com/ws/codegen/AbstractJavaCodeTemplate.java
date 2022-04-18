package com.ws.codegen;

import java.util.HashMap;
import java.util.Map;

import com.ws.codegen.javameta.Class;

public class AbstractJavaCodeTemplate implements IJavaCodeTemplate {

	/**
	 * Map that stores all the keys in velocity template.
	 */
	public Map<String, Object> codeGenMap = new HashMap<String, Object>();
	
	public void setAuthor(String author) {
		this.codeGenMap.put(IJavaCodeTemplate.AUTHOR, "Warrior Showcase");
	}

	public void setClass(Class classObj) {
		this.codeGenMap.put(IJavaCodeTemplate.CLASS, classObj);
	}

	public void setMainComment(String mainComment) {
		this.codeGenMap.put(IJavaCodeTemplate.MAIN_COMMENT, mainComment);
	}

	public void setPackage(String packageName) {
		this.codeGenMap.put(IJavaCodeTemplate.PACKAGE, packageName);
	}

	
	
}
