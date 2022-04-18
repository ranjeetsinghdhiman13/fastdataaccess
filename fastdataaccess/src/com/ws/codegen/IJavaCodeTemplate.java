/**
 * 
 */
package com.ws.codegen;

import com.ws.codegen.javameta.Class;

/**
 * @author ranjeet
 *
 */
interface IJavaCodeTemplate {
	
	public String PACKAGE 					= "package";
	public String CLASS 					= "class";
	public String MAIN_COMMENT				= "mainComment";
	public String AUTHOR					= "author";
	public String OUT_PATH					= "./output/";
	
	public void setPackage(String packageName);
	public void setClass(Class classObj);
	public void setMainComment(String mainComment);
	public void setAuthor(String author);
}
