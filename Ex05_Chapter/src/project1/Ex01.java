package project1;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("A클래스 학생 5명의 성적 입력 : ");
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
