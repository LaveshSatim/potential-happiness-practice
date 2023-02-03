package com.annotation5.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

// no source code
public class Tab {
	@Autowired
	private Microphone microphone;

	public Tab() {
		System.out.println("tab created");
	}

	public void on() {
		System.out.println("turning on...");
		microphone.capture();
	}

//	void setMicrophone(Microphone microphone) {
//		this.microphone = microphone;
//	}

}
