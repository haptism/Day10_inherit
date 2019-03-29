
package com.iu.zoo;

public class Ostrich extends Birds { // 상속

	private int egg;

	// super("test");
	// 부모클래스의 생성자를 호출
	// this(10);
	// this.egg = 10;

	public Ostrich() {

		super();

	}

	public Ostrich(int egg) {

		this.egg = egg;
		this.getAge();
		super.getAge();

	}

	@Override
	public void fly() {

	}
}
