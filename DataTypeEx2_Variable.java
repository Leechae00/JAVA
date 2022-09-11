package javapractice;

public class DataTypeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;

		}			
		printf("%d",v2); //v2는 if 블록 내부에서 선언되었기 때문에 그 바깥에서 사용할 수 없다. 
	}

}
