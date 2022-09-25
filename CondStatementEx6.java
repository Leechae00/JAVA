package javapractice1.wk3;
import java.util.Scanner;
public class CondStatementEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("++ 멤버 유형을 입력하세요 (VIP, NEW, YOUTH 중 선택): ");
		String memberStatus = sc.next();
		String msg;
		
		switch(memberStatus) {
		case "VIP":
			msg = "VIP 고객 해택 적용";
			
		case "NEW":
			msg = " NEW 고객 해택 적용";
			
		case "YOUTH":
			msg = "YOUTH 고객 해택 적용";
			
		default:
			msg = "해택 적용이 없습니다.";
			
		}
	}
}
