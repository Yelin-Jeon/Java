package ex05_1;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hanna";
		String b="point";
		String c="hanna"; //�Ȱ��� ���� ������� �ʰ� �����ͷ� ����Ų��.
		//String d = new String("hanna"); �̷��� �ϸ� �ٽ� �ѹ� �� ���� 
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.compareTo(b)); //���ڰ� ������ 0
		System.out.println(a.compareTo(c)); //���ڰ� �ٸ��� ���,����

	}

}
