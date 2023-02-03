package com.beanscopes.scope;

public class DateConverter {
	private static DateConverter instance;

	private DateConverter() {
	}

	public static synchronized DateConverter getInstance() {
		if (instance == null) {
			instance = new DateConverter();
		}
		return instance;
	}

}
