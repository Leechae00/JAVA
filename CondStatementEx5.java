package javapractice1.wk3;

import java.util.Scanner;

public class CondStatementEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("++ 아이디를 입력하세요 : ");
		String id = sc.next();
		
		if (id.equals("kkiimm")){
			System.out.print("++ 비밀번호를 입력하세요 : ");
			String pw = sc.next();
			if(pw.equals("qwerty")) {
				System.out.println("비밀번호 확인! 로그인에 성공하셨습니다.");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다. ");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
}