package ex05;
import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.print("1번 정수를 입력: ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1= br.readLine();
		int a=Integer.parseInt(str1);
		System.out.print("2번 정수를 입력: ");
		String str2= br.readLine();
		int b=Integer.parseInt(str2);
		//스캐너로 푸셨음
		//java.util.Scanner in =new java.util.Scanner(System.in);
		//int a=in.nextInt();
		
		//Scanner scan = new Scanner(System.in);이라고 할거면 import java.util.Scanner필요
		
		if(a==b) {
			System.out.println("두 수는 Same");
		}
		else {
			System.out.println("두 수는 Different");
		}

	}

}
