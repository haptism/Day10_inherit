package com.iu.himart;

public class Handphone extends Mart {
	private String model;
	private int inch;

	public Handphone() {
		this.model = "s10";
		this.inch = 10;
		this.setBrand("Samsung");
		this.setColor("Blue");
		this.setPrice(100);
		this.setPoint(10);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

}
