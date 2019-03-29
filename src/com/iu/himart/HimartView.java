package com.iu.himart;

import java.util.Scanner;

public class HimartView extends Mart {

	// 각 제품의 정보를 출력 메서드.

	public void view(Tv tv) {

		System.out.println("===========================");
		System.out.println("Brand : " + tv.getBrand());
		System.out.println("Color : " + tv.getColor());
		System.out.println("Price : " + tv.getPrice());
		System.out.println("Point : " + tv.getPoint());
		System.out.println("Inch : " + tv.getInch());
		System.out.println("===========================");

	}

	public void view2(Computer computer) {

		System.out.println("===========================");
		System.out.println("Brand : " + computer.getBrand());
		System.out.println("Color : " + computer.getColor());
		System.out.println("Price : " + computer.getPrice());
		System.out.println("Point : " + computer.getPoint());
		System.out.println("Volume : " + computer.getVolume());
		System.out.println("Cpu : " + computer.getCpu());
		System.out.println("===========================");

	}

	public void view3(Handphone handphone) {

		System.out.println("===========================");
		System.out.println("Brand : " + handphone.getBrand());
		System.out.println("Color : " + handphone.getColor());
		System.out.println("Price : " + handphone.getPrice());
		System.out.println("Point : " + handphone.getPoint());
		System.out.println("Point : " + handphone.getPoint());
		System.out.println("===========================");

	}

	public void view(Tv[] tvs) { // 멤버 배열을 출력
		for (int i = 0; i < tvs.length; i++) {

			this.view(tvs[i]);

		}
	}
}
