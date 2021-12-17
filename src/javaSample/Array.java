package javaSample;

public class Array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog[] a = new Dog[1];
		a[0] = new Dog();
		
		//Dog[] b = new Dog[]{ new Dog(), new Dog() };
		Dog[] b = { new Dog(), new Dog() };
		b[0].name = "チワワ";
		
		Dog[][] c = { { new Dog(), new Dog() }, { new Dog(), new Dog(), new Dog() } };
		c[1][2].name = "ダックスフンド";
		
		System.out.println(a[0].name);
		System.out.println(b[0].name);
		System.out.println(c[1][2].name);
		System.out.println(c.length);
	}

}
