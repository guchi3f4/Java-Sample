package javaStudy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class Parent {
	void set(Collection<String> c) {
		
	}
}

class Child extends Parent {
	void method(Map<Integer, String> m) {
		set(m.values());
	}
}

class Sample {
	static int num;
	
	int getError() {
		try {
			String str = null;
			str.length();
		} catch(NullPointerException e) {
			num = 10;
			return num;
		} finally {
			num = 20;
		}
		return num;
	}
	
	int returnValue(String str) {
		if (str.equals("OK")) {
			return 10;
		}
		return 20;
	}
}

abstract class Abstract1 {
	protected abstract void doTest();
	protected void doProcess() {
		
	}
}

class Sample2 extends Abstract1 {
	public void doTest() {
		
	}
	public void doProcess() { //オーバーライド
		
	}
	
	public void doProcess(int num) { //オーバーロード
		
	}
	
	public String doProcess(String str) { //戻り値の型が違うため、オーバーロードではない
		return str;
	}
}

public class javaStudy {
	static int num4;
	
	static {
		num4 = 10;
	}
	
	javaStudy() {
		javaStudy.num4 = 30;
	}
	
	static void print(String[] str) {
		for(String s : str) {
			System.out.println(s);
		}
	}
	
	public static void main (String[] args) {
		print(args);
		
		System.out.println(num4);
		int num4 = 4;
		
		System.out.println(num4);
		System.out.println(javaStudy.num4);
		
		//Listと配列の違い
		String[] list1 = new String[3]; //配列の大きさを変えることはできない
		List<String> list2 = new ArrayList<String>(); //Listの要素の大きさは可変できる
		//List list3 = new ArrayList<>(Arrays.asList(1, '2', "ああ")); Object型として扱われる。ジェネリクス推奨
		list2.add("たろう");
		list2.add("次郎");
		list2.add("たろう"); //重複可能
		list2.add("さぶろう");
		list2.remove(1);
		list2.set(1, "じろう");
		Collections.sort(list2);
		System.out.println(list2);
		for(String str : list2) {
			System.out.println(str);
		}
		
		//日付、時刻に関するAPI
		LocalDate date1 = LocalDate.of(2021, 10, 12);
		//LocalDate date2 = LocalDate.of(2021, 0, 12);
		//例外が表示される。　java.time.DateTimeException
		LocalDate date3 = LocalDate.now();
		System.out.println(date1);
		System.out.println(date3);
		System.out.println(date3.with(DayOfWeek.MONDAY));
		
		//例外処理
		var sample = new Sample();
		System.out.println(sample.getError());
		
		//配列　繰り返し処理
		int[][] num1 = { { 1, 2, 3 }, {4, 5} };
		for(int[] a : num1) {
			for(int b : a) {
				System.out.print(b);
			}
		}
		System.out.println();
		for(int x = 0; x < num1.length; x++) {
			for(int a : num1[x]) {
				System.out.print(a);
			}
		}
		System.out.println();
		for(Object a : num1) {
			for(int b : (int[])a) {
				System.out.print(b);
			}
		}
		
		String[] str1 = { "A", "B" };
		List<String> str2 = Arrays.asList("A", "B");
		List<String> str3 = new ArrayList<>(Arrays.asList("A", "B"));
		str3.set(1, "C");
		str3.add(2, "B");
		
		System.out.println(str1); //ハッシュコードを表示
		System.out.println(str2);
		System.out.println(str3);
		
		StringBuilder str4 = new StringBuilder("A");
		str4.insert(0, "B");
		str4.append("C");
		str4.replace(0, 1, "b");
		System.out.println(str4);
		
		String str5 = "BBB";
		str5 = str5.replace('B', 'b');
		System.out.println(str5);
		System.out.println(str5.substring(1));
		
		
		int i = 4;
//		Supplier<Integer> s = () -> i;
		//i++; コンパイルエラー　変数iは実質的にfinalとなるため変更を加えるとエラー
		
		int[] int1 = { 1,2,3 };
		int[] int2 = { 1,2,2 };
		
		System.out.println(Arrays.compare(int1, int2));
		
		str2.forEach( f -> System.out.print(f) );
		str3.forEach( System.out::print );
		
		Sample sample2 = new Sample();
		System.out.println();
		System.out.println(sample2.returnValue("O"));
		
		long num2 = (int)'a';
		char char1 = 'b';
		char1 = (char)num2;
		
		int x;
		int y = 2;
		if(y < 3 ) {
			x = 1;
			y = 2;
		} else {
			x = 1; //コメントアウトするとコンパイルエラー：変数xが初期化されない可能性があるため
			y = 1;
		}
		System.out.println(x +","+ y);
		
		int[] numArray1 = new int[2];
		System.out.println(numArray1[0]);
		
		Integer integer1 = Integer.valueOf("10");
		System.out.println(integer1);
		
		int[][] intArray1 = new int[2][3];
		intArray1[0] = new int[] {1, 2, 3, 4, 5};
//		intArray1[0][0] = 2;
		for (int[] a : intArray1) {
			for (int b : a) {
				System.out.print(b);
			}
		}
		System.out.println();
		
		float cc = 1.0f;
		int dd = 10;
		cc = 10L;
		
		char ch1 = 101;
		int in1 = 101;
		short sh2 = 101;
		ch1 = (char)sh2;
		
//		aa = (char)bb;
		System.out.println(ch1);
		
		new javaStudy();
		System.out.println(javaStudy.num4);
		System.out.println(Math.random());
	}
}
