package javapractice1.wk3;

public class LoopStatementEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLine = 10;
		for (int i = 1;i<=numLine;i++) {
			for(int j=10-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k = 0;k<i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
