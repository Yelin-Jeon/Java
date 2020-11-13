package project1;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int score=0;
		
		
		for(int i=0;i<=4;i++) {
			System.out.print((i+1)+"학생 점수 입력 : ");
			Scanner scan = new Scanner(System.in); 
			score = scan.nextInt();
			if(score>100) {
				System.out.println("잘못 입력했습니다.");
				i--; //5개 받을 수 있게 
				continue;
			}
			sum+=score;
		}
		/*
		 * Scanner scan = new Scanner(System.in); int first = scan.nextInt(); int second
		 * = scan.nextInt(); int third = scan.nextInt(); int forth = scan.nextInt(); int
		 * fifth = scan.nextInt();
		 */
		System.out.println("학생들의 성적의 총 합계 : "+sum);
		System.out.println("학생들의 성적의 총 평균 : "+sum/5.0);
	}
}