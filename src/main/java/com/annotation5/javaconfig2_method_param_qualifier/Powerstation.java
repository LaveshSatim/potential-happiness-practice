package com.annotation5.javaconfig2_method_param_qualifier;

// no source code
public class Powerstation {
	private Turbine turbine;

	public Powerstation(Turbine turbine) {
		this.turbine = turbine;
	}

	public void on() {
		turbine.produce();
	}
}
