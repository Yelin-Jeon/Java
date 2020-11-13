package ex05;
import java.util.Scanner;

public class Ex10 {
	//그냥 최대값 구하는 문제인데, 순서대로 뽑는 코드 짜버렸다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, mid, min; //따로 선언하는게 확장할 때 좋음
		//max초기화를 -1로 하는 경우가 많은데, 음수값이 나왔을 때 잘못된거 파악하기 쉬움
		
		
		System.out.print("정수 값을 입력하시오(1회) : ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.print("정수 값을 입력하시오(2회) : ");
		int second = scan.nextInt();
		System.out.print("정수 값을 입력하시오(3회) : ");
		int third = scan.nextInt();
		
		if(first>second&&first>third) {
			max=first;
			if(second>third) {
				mid=second;
				min=third;
			}
			else {
				mid=third;
				min=second;
			}
		}
		else if(second>first&&second>third) {
			max=second;
			if(first>third) {
				mid=first;
				min=third;
			}
			else {
				mid=third;
				min=first;
			}
		}
		else {
			max=third;
			if(first>second) {
				mid=first;
				min=second;
			}
			else {
				mid=second;
				min=first;
			}
		}
		System.out.println("최대값은 "+max+" "+mid+" "+min+"입니다.");

	}
//코딩 어려우면 raptor 다운받아서 플로우차트 만들어서 자바 출력 
}
