package ex05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}//for(int i=1;i<=20;i++)
		System.out.println("1에서 20까지의 수 중에 짝수 합계 : "+sum);

	}

}
