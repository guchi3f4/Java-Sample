package javaStudy;

interface A {
	default void sample() {
		System.out.println("A");
	}
}

interface B extends A {
	default void sample() {
		A.super.sample();
		System.out.println("B");
	}
}

class C implements B {
	public void sample() {
		B.super.sample();
		System.out.println("C");
	}
}

class D extends C {
	public void sample() {
		super.sample();
		System.out.println("D");
	}
}

public class SampleInterface {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		A d = new D();
		d.sample();
	}

}
