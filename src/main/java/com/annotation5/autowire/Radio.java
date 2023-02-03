package com.annotation5.autowire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

public class Radio {

	private Tuner tuner;

	public Radio() {
		super();
	}

	@Autowired
	public Radio(Tuner tuner) {
		this.tuner = tuner;
	}

	@Override
	public String toString() {
		return "Radio [tuner=" + tuner + "]";
	}

}
