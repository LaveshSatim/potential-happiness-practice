package com.cpe.beans;

import java.beans.PropertyEditorSupport;

public class GeoLocationPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] tokens = null;
		GeoLocation geoLocation = null;

		tokens = text.split(",");
		geoLocation = new GeoLocation();
		geoLocation.setLat(Double.parseDouble(tokens[0]));
		geoLocation.setLog(Double.parseDouble(tokens[1]));

		super.setValue(geoLocation);
	}

}
