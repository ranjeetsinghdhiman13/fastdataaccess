package com.ws.codegen.velocity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.ui.velocity.VelocityEngineFactory;
import org.springframework.ui.velocity.VelocityEngineUtils;

/**
 * 
 */

class VO {
	public Integer i = 100;
	ArrayList<String> list = new ArrayList<String>();
}

/**
 * @author RD30953
 *
 */
public class VelocityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VO vo = new VO();
		vo.list.add("str1");
		vo.list.add("str2");
		Object nullObject = null;
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("package", "test");
		map.put("author", "me");
		map.put("author", nullObject);
		VelocityEngine engine = new VelocityEngine();
		try {
			String str = VelocityEngineUtils.mergeTemplateIntoString(
					engine, "./templates/VOjava.java.vm", map);
			System.out.println(str);
			FileWriter writer = new FileWriter("./output/test.java");
			writer.write(str);
			writer.close();
		} catch (VelocityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean genCode(Map<String, Object> map, String path, String fileName) {
		VelocityEngine engine = new VelocityEngine();
		File outputFile;
		try {
			String str = VelocityEngineUtils.mergeTemplateIntoString(
					engine, "./templates/VOjava.java.vm", map);
			//System.out.println(str);
			path = "./output/" + path;
			outputFile = new File(path);
			outputFile.mkdirs();
			FileWriter writer = new FileWriter(path + "/" + fileName + ".java");
			writer.write(str);
			writer.close();
			return outputFile.exists();
		} catch (VelocityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return false;
	}

}

