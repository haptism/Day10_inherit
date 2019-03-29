package com.iu.zoo;

public class Lion extends Animal {
	private int tooth;

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.sleep();
	}

	public int getTooth() {
		return tooth;
	}

	public void setTooth(int tooth) {
		this.tooth = tooth;
	}
}