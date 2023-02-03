package com.singleton.beans;

import java.util.Properties;

public class SystemPropertiesTest {
	public static void main(String[] args) {
		System.setProperty("a", "lavesh");
		String a = System.getProperty("a");
		String b = System.getProperty("b");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.setProperty("customProperty", "No Value");

		Properties jvmProperties = System.getProperties();
		jvmProperties.forEach((key, value) -> {
			System.out.println(key + " = " + value);
		});

	}
}
