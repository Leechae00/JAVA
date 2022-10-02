package javapractice1.wk4;

public class MyCalculator2 {
	int sum1(int[] values) {
		int number = values.length;
		int result = 0;
		for (int i = 0; i<number;i++) {
			result += values[i];
		}
		return result;
	}
	int sum2(int ... values) {
		int number2 = values.length;
		int result = 0;
		for (int i = 0; i<number2;i++) {
			result += values[i];
		}
		return result;
	}
}
