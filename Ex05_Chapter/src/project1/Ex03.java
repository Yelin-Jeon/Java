package project1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		int [] arr = new int[5]; //grade로 바꾸면 더 알아보기 쉬움
		String[] name = new String[5];
		
	Scanner scan = new Scanner(System.in);
	for(int i=0; i<5;i++) {
		System.out.print("이름 입력 : ");
		name[i]=scan.next();
		System.out.print("학생 점수 입력 : ");
		arr[i]=scan.nextInt();
	}
	for(int i=0; i<5;i++) {
		System.out.println("이름 입력 : "+name[i]);
		System.out.println("학생 점수 출력 : " + arr[i]);
	}
		
		for(int i=0; i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println("학생들의 점수 총합" +sum);
		System.out.println("학생들의 점수 평균"+sum/5.0);
	}

}