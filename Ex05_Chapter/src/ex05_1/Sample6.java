package ex05_1;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= new String("   C#");
		String b = new String(",C++");
		
		System.out.println(a+"�� ���̴� "+a.length());
		System.out.println(a.contains("#"));
		
		a=a.concat(b); //���ڿ� ����
		System.out.println(a);
		
		a=a.trim();  //���ڿ� �� ���� ���� ���� 
		System.out.println(a);
		
		a=a.replace("C#","Java"); //"C#"�� "Java"�� ���� 
		System.out.println(a);

	}

}
