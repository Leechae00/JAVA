package javapractice1.wk4;

public class MyCar_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar jCar = new MyCar();
		
		System.out.println("제작회사: " + jCar.company);
		System.out.println("모델회사: " + jCar.model);
		System.out.println("색   상: " + jCar.color);
		System.out.println("최고속도: " + jCar.maxSpeed);
		System.out.println("현재속도: " + jCar.currentSpeed);
		
		jCar.currentSpeed = 30;
		System.out.println("현재속도: " + jCar.currentSpeed);
	}
		
	
}
