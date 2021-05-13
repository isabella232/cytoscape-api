package org.cytoscape.model;

/*
 * #%L
 * Cytoscape Model API (model-api)
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2021 The Cytoscape Consortium
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

public class DummyCyEdge extends DummyGraphObject implements CyEdge {
	CyNode source;
	CyNode target;
	long index;
	boolean directed;

	public DummyCyEdge(CyNode src, CyNode tgt, boolean dir, long ind) {
		super();
		source = src;
		target = tgt;
		directed = dir;
		index = ind;
	}

	public CyNode getSource() {
		return source;
	}

	public CyNode getTarget() {
		return target;
	}

	public boolean isDirected() {
		return directed;
	}
}
