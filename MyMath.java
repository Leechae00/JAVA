package javapracticce1.wk4;

public class MyMath {

	static double pi = 3.14149;
	static int abs(int input) {
		if (input < 0) {
			return -input;
		}
		else {
			return input;
		}
	}
	static double pow(double input) {
		return input * input;
	}
	
	static int Plus(int input, int output) {
		return input + output;
	}
	static int Minus(int input, int output) {
		return input-output;
	}
}
