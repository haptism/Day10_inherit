package com.ninja.quiz;

public class God {

	private static final God god = new God();

	private God() {

	}

	public void say() {
		System.out.println(" Today is Friday");
	}

	public static God get() { // 객체를 만들지 않고도 만들수 있다.
		return god;
	}
}
