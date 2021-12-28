package javaSample;

class A {
	String val = "a" ;
	void print() {
		System.out.println(val);
	}
}

class B extends A {
//	B() {
//		this.val = "c";
//	}
	
	String val = "b" ;
}

public class SampleA {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		A a_a = new A();
		A a_b = new B();
		//B b_a = (B) new A(); スーパークラスからサブクラスへの型変換はエラーが起きる
		B b_b = new B();
		
		System.out.println(a_a.val);
		System.out.println(a_b.val);
		//System.out.println(b_a.val);
		System.out.println(b_b.val);
		
		a_a.print();
		a_b.print();
		//b_a.print();
		b_b.print();
		
		//繰り返し処理
		for(int i = 0; i < 5; i++) {
			for(i = 5; i < 10; i++) {
				System.out.print(i);
			}
		}
		
	}

}
