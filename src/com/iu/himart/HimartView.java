package com.iu.himart;

import java.util.Scanner;

public class HimartView extends Mart {

	// 각 제품의 정보를 출력 메서드.

	public void view(Mart mart) {

		System.out.println("===========================");
		System.out.println("Brand : " + mart.getBrand());
		System.out.println("Color : " + mart.getColor());
		System.out.println("Price : " + mart.getPrice());
		System.out.println("Point : " + mart.getPoint());
		System.out.println("===========================");
	}
//		if (m instanceof Tv) {
//			Tv tv = (Tv)m;
//			System.out.println(tv.getInch());
//		}else if (m instanceof Computer)m;
//	}else
//
//	{
//		HandPhone h = (HandPhone) m;
//	}

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
