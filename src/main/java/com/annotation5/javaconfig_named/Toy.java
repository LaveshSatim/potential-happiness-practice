package com.annotation5.javaconfig_named;

import javax.inject.Named;

@Named // similar like component
public class Toy {
	public void on() {
		System.out.println("switched on the toy");
	}
}
