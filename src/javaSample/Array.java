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
		
		String[][][] f = { { { "A" }, { "B" } , { "C" } }, { { "A" }, { "B" } , { "C" } } , { { "A" }, { "B" } , { "C" } } };
		
		int[][] g = { {1, 2}, {3, 4} };
		int[][] h = { {1, 2}, {3, 4} };
		int[][] i = g.clone();
		g[0][0] = 3;
		
		System.out.println(a[0].name);
		System.out.println(b[0].name);
		System.out.println(c[1][2].name);
		System.out.println(c.length);
		System.out.println(f[2][1][0]);
		
		System.out.println(g == h);
		System.out.println(g == i);
		System.out.println(g[0] == h[0]);
		System.out.println(g[0] == i[0]);
		System.out.println(h[0][0]);
		System.out.println(i[0][0]);
		
	}

}
