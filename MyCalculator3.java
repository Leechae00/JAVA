package javapractice1.wk4;

public class MyCalculator3 {
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	double avg(int x,int y) {
		double result = plus(x, y)/(double) 2;
		return result;
	}
	void execute() {
		double result = avg(7,10);
		println("실행결과 " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
