import java.util.Scanner;

public class Java_Study1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int str = scan.nextInt();
		//int number = Integer.parseInt(str);
		if (str%2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
	}
}
