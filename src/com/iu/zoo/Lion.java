package com.iu.zoo;

public class Lion extends Animal {
	private int tooth;

	public Lion() { // 생성자가 있어야함
		super();

	}
//	public static void main(String[] args) {
//		Lion lion = new Lion();
//		lion.sleep(); 
//	}

	public int getTooth() {
		return tooth;
	}

	public void setTooth(int tooth) {
		this.tooth = tooth;
	}

	public void eat() {
		// 오버라이딩
//		super.eat();
		System.out.println("찹찹찹");

	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		// 실체화 되지않은 객체는 만들면 안됨
	}
}