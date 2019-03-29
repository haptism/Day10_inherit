package com.iu.himart;

import java.util.Scanner;

public class Customer {

	private int price;
	private int point;

	public Customer() {
		this.price = 1000;
		this.point = 0;

	}

	// buy 매개변수 1개
	// 계산 후, 현재 잔액, 현재 포인트

	public void buy(Mart mart) {
		this.price = this.price - mart.getPrice();
		this.point = this.point + mart.getPoint();

	}

	public void buy(Computer c) {
		System.out.println("잔액 : " + c.getPrice());
		System.out.println("포인트 : " + c.getPoint());
	}

	public void buy(Handphone h) {
		System.out.println("잔액 : " + h.getPrice());
		System.out.println("포인트 : " + h.getPoint());

	}

}
