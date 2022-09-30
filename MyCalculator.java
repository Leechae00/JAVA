package javapractice1.wk4;

public class MyCalculator {
	
	void poweron(){
		System.out.println("시스템 전원을 켭니다.");
	}
	int plus (int x,int y) {
		int result = x + y;
		return result;
	}
	int ma (int x,int y) {
		int result = x - y;
		return result;
	}
	int mul (int x,int y) {
		int result = x * y;
		return result;
	}
	double divide(double x, double y) {
		double result = x/y;
		return result;
	}
	void poweroff() {
		System.out.println("시스템 전원을 끕니다.");
	}
}
