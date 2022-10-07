package javapracticce1.wk4;

public class MyMath_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 10;
		double areaCircle = MyMath.pow(radius)*MyMath.pi;
		int resultAbs = MyMath.abs(-150);
		int resultPlus = MyMath.Plus(100,21);
		int resultMinus = MyMath.Minus(100,21);
		
		System.out.println("areaCicle (radius: " + radius + "): "+ areaCircle);
		System.out.println("resultabs: "+ resultAbs);
		System.out.println("resultPlus: "+ resultPlus);
		System.out.println("resultMinus: "+resultMinus);
		
	}

}
