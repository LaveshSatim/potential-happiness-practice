package com.singleton.beans;

import java.util.Date;

public class JobScheduler {
	public void execute() {
		DateConverter dc = DateConverter.getInstance();
		System.out.println("DateConverter hashCode: " + dc.hashCode());
	}
}
