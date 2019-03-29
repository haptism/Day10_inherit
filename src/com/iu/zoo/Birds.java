package com.iu.zoo;

public abstract class Birds extends Animal {
	private String wing;

	public abstract void fly();

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	@Override
	public void eat() {

	}

}
