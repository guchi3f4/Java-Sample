package javaSample;

public class BmiCalc {
//BMI(体格指数)を計算するプログラム
//BMI = 体重 / (身長 * 身長)
//BMI = 身長 m、体重 kg

	public static void main(String[] args) {
		double weight,height,bmi;
		
		weight = 68;
		height = 1.7;
		bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("やせ型です");
		} else if (bmi < 25) {
			System.out.println("標準です");
		} else {
			System.out.println("です");
		}
	}

}
