package javaSample;

public class CommonMultiple {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		for (int i = 1; i < 100; i++) {
//			if ((i % 2 == 0) && (i % 3 == 0)) {
//				System.out.println(i);
//			}
//		}
		
		int i = 1;
		while (i < 100) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
			}
			i++;
		}
	}

}
