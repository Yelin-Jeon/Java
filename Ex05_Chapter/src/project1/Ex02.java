package project1;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int score=0;
		
		
		for(int i=0;i<=4;i++) {
			System.out.print((i+1)+"�л� ���� �Է� : ");
			Scanner scan = new Scanner(System.in); 
			score = scan.nextInt();
			if(score>100) {
				System.out.println("�߸� �Է��߽��ϴ�.");
				i--; //5�� ���� �� �ְ� 
				continue;
			}
			sum+=score;
		}
		/*
		 * Scanner scan = new Scanner(System.in); int first = scan.nextInt(); int second
		 * = scan.nextInt(); int third = scan.nextInt(); int forth = scan.nextInt(); int
		 * fifth = scan.nextInt();
		 */
		System.out.println("�л����� ������ �� �հ� : "+sum);
		System.out.println("�л����� ������ �� ��� : "+sum/5.0);
	}
}