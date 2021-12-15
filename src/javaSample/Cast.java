package javaSample;

class Animal {
	String name;
}

class Dog extends Animal {	
}

public class Cast {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte calc1_1 = 1;
		short calc1_2 = 2;
		String calc1_3 = "00000000003";
		String answer1 = calc1_1 + calc1_2 + calc1_3;
		System.out.println(answer1);
		
		byte calc2_1 = 4;
		double calc2_2 = 5;
		int calc2_3 = 6;
		double answer2 = calc2_1 + calc2_2 + calc2_3;
		System.out.println(answer2);
		
		short calc3_1 = 7;
		String calc3_2 = "8";
		int calc3_3 = 9;
		int answer3 = calc3_1 + Integer.parseInt(calc3_2) + calc3_3;
		System.out.println(answer3);
		
		int calc4_1 = 10;
		long calc4_2 = 11;
		long answer4 = calc4_1 + calc4_2;
		System.out.println(answer4);
		
		Dog dog = new Dog();
		//アップキャスト
		Animal animal = dog;
		//ダウンキャスト
		dog = (Dog) animal;
		animal.name = "犬";
		System.out.println(dog.name);
		
		//例外が表示される記述
		
//		Animal animal2 = new Animal();
//		Dog dog2 = (Dog) animal2;
//		dog2.name = "チワワ";
//		System.out.println(dog2.name);
		
//		Dog dog2 = new Dog();
//		dog2 = (Dog)new Animal();
//		dog2.name = "ポメラニアン";
//		System.out.println(dog2.name);
		

	}

}
