package javaStudy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sample {
	int num;
	
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
}

public class javaStudy {
	public static void main (String[] args) {
		
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
	}
}
