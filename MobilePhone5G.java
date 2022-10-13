
public class MobilePhone5G extends MobilePhone{
	double carrierFreq;
	
	MobilePhone5G(String model, String color, double carrierFreq){
		this.model = model;
		this.color = color;
		this.carrierFreq = carrierFreq;
	}
	
	void turnOn5G() {
		if(carrierFreq<6)
			System.out.println("5G 네트워크에 접속합니다. 주파수: "+carrierFreq+" GHz (최대속도: 1Gb/s");
		else
			System.out.println("5G 네트워크에 접속합니다. 주파수: "+carrierFreq+" GHz (최대속도: 10Gb/s");
	}
	void changeCarrierFreq(double carrierFreq) {
		System.out.println("통신 주파수를 "+carrierFreq+" 으로 바꿉니다" );
		if (carrierFreq<6) {
			
			System.out.println("   -최대속도 1Gb/s");
		}
		else 
			
			System.out.println("   -최대속도 10Gb/s");
	}
	
	void turnOff5G() {
		System.out.println("5G 통신을 종료합니다.");
	}
	
}
