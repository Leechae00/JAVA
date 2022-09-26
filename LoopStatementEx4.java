package javapractice1.wk3;

public class LoopStatementEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				System.out.print("주사위 프로그램 종료!!");
				break;
			}
		}
	}

}
