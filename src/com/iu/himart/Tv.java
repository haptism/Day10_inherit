package com.iu.himart;

public class Tv extends Mart {
	private int inch;

	public Tv() {
		this.inch = 10;
		this.setBrand("Lg");
		this.setColor("Black");
		this.setPrice(400);
		this.setPoint(40);
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

}
