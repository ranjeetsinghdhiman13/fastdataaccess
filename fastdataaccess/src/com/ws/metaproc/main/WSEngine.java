/**
 * 
 */
package com.ws.metaproc.main;

import net.sourceforge.schemaspy.model.Database;

import org.w3c.dom.Document;

import com.ws.codegen.WSCodeGenerator;
import com.ws.exception.FDAException;
import com.ws.metaproc.document.WSDocumentParser;

/**
 * @author ranjeet
 *
 */
public class WSEngine {
	
	WSDocumentParser parser; 

	public void startFDA() throws FDAException{
		parser = new WSDocumentParser();
		Document doc = parser.getMetaDocument(null);
		WSMain.sop("Document Parsed");
		WSMain.sop("Node " + doc.getDocumentElement().getNodeName());
		Database db = new Database(doc.getDocumentElement());
		WSMain.sop("Database object created");
		WSMain.sop("Generating Code...");
		WSCodeGenerator codeGenerator = new WSCodeGenerator(db);
		WSMain.sop("Generating Code Ends.");
	}
}
