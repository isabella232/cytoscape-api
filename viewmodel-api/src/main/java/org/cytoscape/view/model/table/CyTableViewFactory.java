package org.cytoscape.view.model.table;

import org.cytoscape.model.CyTable;

public interface CyTableViewFactory {

	CyTableView createTableView(CyTable table);
	
}