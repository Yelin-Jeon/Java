package project1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		int [] arr = new int[5]; //grade�� �ٲٸ� �� �˾ƺ��� ����
		String[] name = new String[5];
		
	Scanner scan = new Scanner(System.in);
	for(int i=0; i<5;i++) {
		System.out.print("�̸� �Է� : ");
		name[i]=scan.next();
		System.out.print("�л� ���� �Է� : ");
		arr[i]=scan.nextInt();
	}
	for(int i=0; i<5;i++) {
		System.out.println("�̸� �Է� : "+name[i]);
		System.out.println("�л� ���� ��� : " + arr[i]);
	}
		
		for(int i=0; i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println("�л����� ���� ����" +sum);
		System.out.println("�л����� ���� ���"+sum/5.0);
	}

}