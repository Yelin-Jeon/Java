package ex05;
import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.print("1�� ������ �Է�: ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1= br.readLine();
		int a=Integer.parseInt(str1);
		System.out.print("2�� ������ �Է�: ");
		String str2= br.readLine();
		int b=Integer.parseInt(str2);
		//��ĳ�ʷ� Ǫ����
		//java.util.Scanner in =new java.util.Scanner(System.in);
		//int a=in.nextInt();
		
		//Scanner scan = new Scanner(System.in);�̶�� �ҰŸ� import java.util.Scanner�ʿ�
		
		if(a==b) {
			System.out.println("�� ���� Same");
		}
		else {
			System.out.println("�� ���� Different");
		}

	}

}
