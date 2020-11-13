package ex05_1;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hanna";
		String b="point";
		String c="hanna"; //똑같은 값이 저장되지 않고 포인터로 가르킨다.
		//String d = new String("hanna"); 이렇게 하면 다시 한번 더 저장 
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.compareTo(b)); //문자가 같으면 0
		System.out.println(a.compareTo(c)); //문자가 다르면 양수,음수

	}

}
