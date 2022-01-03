package javaSample;

//interface Interface1 {
//	void test();
//}

class Sample1 {
	String name;
	
	public String getName() {
		return name;
	}
	
	public void test() {
		System.out.println("テスト1");
	}
	
	public int chack(int a) {
		return a;
	}
	
	public void modify(Sample1 a) {
		a.name = "太郎";
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

class Sample3 extends Sample1 {
	String name;
	
//	public String getName() {
//		return name;
//	}
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
		
		boolean bb = true;
		boolean aa = true;
		System.out.println(aa == bb);
		
		Sample1 a2 = new Sample1();
		Object b2 = new Sample1();
		Sample1 c = (Sample1) b2;
		Sample1 d = null;
		
		System.out.println(a2.name == c.name);
		System.out.println(a2 == d);
		
		for (   int i = 0, j = 0;
				i < 3 && j < 5;
				i++             	) 
		{
			System.out.println(i++);
			j += i;
		}
		
//		Sample1[] sam = { new Sample1(), new Sample2() };
		Sample1[] str = new Sample1[1]; 
		System.out.println(str[0]);
		
		//Sample1[] sam2 = new Sample1[1];
		//System.out.println(sam2[0].name); //例外が発生する
		
		Integer inte1 = (int)2.7; 
		int int1 = (int)1.9;
		inte1 += int1;
		System.out.println(inte1);
		
		Sample1 a3 = new Sample1();
		Sample2 b3 = new Sample2();
		a3.modify(b3);
		System.out.println(a3.name);
		System.out.println(b3.name);
		
		Sample1 a4 = new Sample1();
		Sample3 b4 = new Sample3();
		b4.name = "次郎";
		System.out.println(a4.getName());
		System.out.println(b4.getName());
		System.out.println(b4.name);
	}

}
