package javapractice1.wk3;

public class LoofStatementEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		while (num > 10) {
			System.out.println(num--);
		}
		boolean flag = true;
		while (flag) {
			num--;
			if (num == 3) {
				System.out.println("num==3 -> while 투표 종료!");
				break;
			}
		}
	}
}
