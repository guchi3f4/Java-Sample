package javaStudy;

import java.util.function.Function;

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

interface Lamda1 {
	void sample(String name);
}

public class SampleInterface {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		A d = new D();
		d.sample();
		
		Function<String, String> f = (val) -> {
			return val + "さん";
		};
		System.out.println(f.apply("高橋"));
		
		String age = "20歳";
		Lamda1 r = (name) -> {
			System.out.println(name + ":" + age);
		};
		r.sample("太郎");
	}

}
