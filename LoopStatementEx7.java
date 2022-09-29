package javapractice1.wk3;

public class LoopStatementEx7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------------------");
				System.out.println("w: 빠르게 | s : 천천히 | q : 종료");
				System.out.println("----------------------------");
			}
			keyCode = System.in.read();
			
			if(keyCode==119) {			// !!equals는 문자열 비교, 정수를 비교할때는 쓰지 않음!! 
				speed+=1;
				System.out.printf("현재속도 : %d\n",speed);
			}
			if(keyCode==115) {			
				speed-=1;
				System.out.printf("현재속도 : %d\n",speed);
			}
			if(keyCode==113) {			
				System.out.print("프로그램 종료\n");
				break;
			}
		}
	}
}
