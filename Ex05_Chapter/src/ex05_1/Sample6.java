package ex05_1;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= new String("   C#");
		String b = new String(",C++");
		
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("#"));
		
		a=a.concat(b); //문자열 연결
		System.out.println(a);
		
		a=a.trim();  //문자열 앞 뒤의 공백 제거 
		System.out.println(a);
		
		a=a.replace("C#","Java"); //"C#"을 "Java"로 변경 
		System.out.println(a);

	}

}
