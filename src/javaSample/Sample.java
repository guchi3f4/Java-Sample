package javaSample;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "Hello World";
		hello(str);
		System.out.println("-------------");
		System.out.println(str);
		
		//同一性、同値性
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
		System.out.println(dog3 == dog4);
		System.out.println(dog3.equals(dog4));
		
		dog4 = dog3;
		System.out.println(dog3 == dog4);
		System.out.println(dog3.equals(dog4));

	}
    private static void hello(String str) {
		var a = str.replaceAll("World", "Java");
		var b = str.replace("l", "a");
		var c = a.charAt(2);
		StringBuilder d = new StringBuilder("abc");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.substring(0, 5));
		System.out.println(c);
		System.out.println(d.capacity());
		System.out.println(d.reverse());
	}

}
