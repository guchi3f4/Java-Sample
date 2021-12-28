package javaSample;

//interface Interface1 {
//	void test();
//}

class Sample1 {
	public void test() {
		System.out.println("テスト1");
	}
	
	public int chack(int a) {
		return a;
	}
	
	
}

class Sample2 extends Sample1 {
	public void test() {
		System.out.println("テスト2");
	}
	
	public long chack(long b) {
		return b;
	}
	
	public int chack(int b) {
		return b + b;
	}
	
	public int chack(short b) {
		return b * 3;
	}
	
	
}

public class SampleB {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sample1 a = new Sample1();
		Sample2 b = new Sample2();
		
		a.test();
		b.test();
		
		System.out.println(a.chack(1));
		System.out.println(b.chack(2));
		System.out.println(b.chack((short)2));
	}

}
