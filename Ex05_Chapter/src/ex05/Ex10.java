package ex05;
import java.util.Scanner;

public class Ex10 {
	//�׳� �ִ밪 ���ϴ� �����ε�, ������� �̴� �ڵ� ¥���ȴ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, mid, min; //���� �����ϴ°� Ȯ���� �� ����
		//max�ʱ�ȭ�� -1�� �ϴ� ��찡 ������, �������� ������ �� �߸��Ȱ� �ľ��ϱ� ����
		
		
		System.out.print("���� ���� �Է��Ͻÿ�(1ȸ) : ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�(2ȸ) : ");
		int second = scan.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�(3ȸ) : ");
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
		System.out.println("�ִ밪�� "+max+" "+mid+" "+min+"�Դϴ�.");

	}
//�ڵ� ������ raptor �ٿ�޾Ƽ� �÷ο���Ʈ ���� �ڹ� ��� 
}
