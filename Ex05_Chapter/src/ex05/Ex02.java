package ex05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수를 입력 : ");
		java.util.Scanner in = new java.util.Scanner(System.in);
		int a= in.nextInt();
		if(a%2==0) {
			System.out.println("입력한 수는 짝수입니다.");
		}
		if(a%2!=0) {
			System.out.println("입력한 수는 홀수입니다.");
		}

	}

}
