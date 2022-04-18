package com.ws.metaproc.document;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.ws.exception.FDAException;

/**
 * Returns a document object.
 * @author ranjeet
 *
 */
public class WSDocumentParser {
	
	public Document getMetaDocument(String path) throws FDAException {
		path = "e:\\sampleout\\test.xml";
		Document doc = null;
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = builder.parse(path);
		} catch (SAXException e) {
			e.printStackTrace();
			throw new FDAException(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new FDAException(e);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			throw new FDAException(e);
		}
		return doc;
	}

}
