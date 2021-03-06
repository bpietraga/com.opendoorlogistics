/*******************************************************************************
 * Copyright (c) 2014 Open Door Logistics (www.opendoorlogistics.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at http://www.gnu.org/licenses/lgpl.txt
 ******************************************************************************/
package com.opendoorlogistics.studio.components.map;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MapConfig")
public class MapConfig implements Serializable{
	private boolean useCustomTooltips;

	public boolean isUseCustomTooltips() {
		return useCustomTooltips;
	}

	@XmlElement
	public void setUseCustomTooltips(boolean useCustomTooltips) {
		this.useCustomTooltips = useCustomTooltips;
	}
	
}
