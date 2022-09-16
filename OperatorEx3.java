package javapractice1.wk3;

public class OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char char1 = 'a';
		char char2 = 'b';

		System.out.println("char1 < char2 ?  " + (char1<char2)); //t
		
		String str1 = "자바자바";
		String str2 = "자바자바";
		String str3 = new String("자바자바"); 
		
		System.out.println("str1 == str2 ?  " + (str1 == str2));  // str1,str2는 참조가 같음 true
 		System.out.println("str1 == str3 ?  " + (str1 == str3));  // 참조가 같은지 false
		
	}
}
