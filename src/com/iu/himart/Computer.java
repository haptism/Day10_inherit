package com.iu.himart;

public class Computer extends Mart {
	private int volume;
	private String cpu;

	public Computer() {
		this.cpu = "i7";
		this.volume = 256;
		this.setBrand("Apple");
		this.setColor("Silver");
		this.setPrice(200);
		this.setPoint(20);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
