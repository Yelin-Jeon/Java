package ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum= (i%3==0)?sum+=i:sum;
		}
		System.out.println("1에서 50까지의 수 중 3의 배수의 합계 : "+sum);

	}

}
