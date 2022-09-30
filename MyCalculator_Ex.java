package javapractice1.wk4;

public class MyCalculator_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCalc = new MyCalculator();
		myCalc.poweron();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		int result2 = myCalc.ma(7,6);
		System.out.println("result2: " + result2);
		
		int result3 = myCalc.mul(5,9);
		System.out.println("result3: " + result3);
		
		byte x = 10;
		byte y = 4;
		double result4 = myCalc.divide(x,y);
		System.out.println("result4: " + result4);
	}
}
