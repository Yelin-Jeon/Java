package ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum= (i%3==0)?sum+=i:sum;
		}
		System.out.println("1���� 50������ �� �� 3�� ����� �հ� : "+sum);

	}

}
