package javapractice1.ch3;

public class DataType_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "김준영";
		String strVar2 = "김준영";
		
		if (strVar1 == strVar2) { //주소가 같은지
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		} else {
			System.out.println("strValr1과 strVar2는 참조가 다름.");
		}
		if(strVar1.equals(strVar2)){ // 실제 데이터가 같은지
			System.out.println("strVar1과 strvar2는 문자열이 같음.");
		}
		
		String strVar3 = new String("김준영"); 
		String strVar4 = new String("김준영");
		
		if (strVar3 == strVar4) { 
			System.out.println("strVar3과 strVar4는 참조가 같음.");
		} else {
			System.out.println("strValr3과 strVar4 참조가 다름.");
		}
		if(strVar3.equals(strVar4)){
			System.out.println("strVar3과 strvar4는 문자열이 같음.");
		}
	}
}
