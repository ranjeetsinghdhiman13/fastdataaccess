/**
 * 
 */
package com.ws.metaproc.main;

import java.util.Date;

import com.ws.exception.FDAException;

/**
 * WSMain. Main class to start the processing of the schema file generated
 * by WSSchemaSpy. 
 * @author ranjeet
 *
 */
public class WSMain {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String schemaPath = args[0];
		if (args[0] == null || args[0].length() == 0) {
			System.out.println ("Please mention schema XML file path");
		}*/
		//Call schema processor
		WSEngine engine = new WSEngine();
		try {
			WSMain.sop("Engine started");
			engine.startFDA();
			WSMain.sop("Engine ends");
		} catch (FDAException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sop(String str) {
		System.out.println(new Date() + " " + str);
	}

}
