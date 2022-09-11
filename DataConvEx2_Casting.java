package javapractice;

public class DataConvEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue); // 유니코드로 44032는 '가'임
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue= (int)doubleValue;
		System.out.println(intValue); // 강제변환으로 소수점이 떨어져 나감
	}

}
