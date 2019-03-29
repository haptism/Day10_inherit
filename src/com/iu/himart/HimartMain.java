package com.iu.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Tv tv = new Tv();
		Handphone handphone = new Handphone();

		HimartView hv = new HimartView();

		Tv[] tvs = new Tv[3];
		tvs[0] = new Tv();
		tvs[1] = new Tv();
		tvs[2] = new Tv();

		Computer[] computers = new Computer[3];
		computers[0] = new Computer();
		computers[1] = new Computer();
		computers[2] = new Computer();

		Handphone[] handphones = new Handphone[3];
		handphones[0] = new Handphone();
		handphones[1] = new Handphone();
		handphones[2] = new Handphone();

	}

}
