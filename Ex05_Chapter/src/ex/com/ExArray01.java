package ex.com;

import java.util.Scanner;

public class ExArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		int [] arr = new int[5];
	Scanner scan = new Scanner(System.in);
	for(int i=0; i<5;i++) {
		System.out.print((i+1)+".정수 입력 : ");
		arr[i]=scan.nextInt();
	}
		
		for(int i=0; i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
