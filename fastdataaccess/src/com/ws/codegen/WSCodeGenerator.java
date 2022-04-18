/**
 * 
 */
package com.ws.codegen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.ws.codegen.java.VOCodeGen;

import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.Table;

/**
 * @author ranjeet
 * This class takes the database object as input and then generates classes for 
 * the data access layer. The hierarchy of classes for this layer are
 * <Table>VO.java
 * <Table>BaseVO.java
 * <Table>Queries.java
 * <Table>BaseQueries.java
 * <Table>DAO.java
 * <Table>BaseDAO.java
 */
public class WSCodeGenerator {
	
	public WSCodeGenerator(Database db) {
		// process tables in the database.
		Collection<Table> tables = db.getTables();
		Iterator<Table> itr = tables.iterator();
		while (itr.hasNext()) {
			Table table = itr.next();
			VOCodeGen voCode = new VOCodeGen(table);
		}
	}

}
