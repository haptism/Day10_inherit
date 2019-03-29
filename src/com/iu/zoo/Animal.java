package com.iu.zoo;

public abstract class Animal { // 상속 했었다.

	// 공통적인 요소

	private String color;
	private double height;
	private int weight;
	private int age;

	public void sleep() {

		System.out.println("sleep");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {

	}

}
