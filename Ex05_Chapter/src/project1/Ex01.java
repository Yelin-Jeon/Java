package project1;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("AŬ���� �л� 5���� ���� �Է� : ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int forth = scan.nextInt();
		int fifth = scan.nextInt();
		
		int sum=first+second+third+forth+fifth;
		System.out.println(first+" "+second+" " +third+" "+forth+" "+fifth);
		System.out.println(sum);
		System.out.println(sum/5.0);
	}

}
