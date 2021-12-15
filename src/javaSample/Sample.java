package javaSample;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "Hello World";
		hello(str);
		System.out.println(str);

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
