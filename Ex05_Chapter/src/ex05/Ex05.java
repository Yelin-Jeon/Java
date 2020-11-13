package ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
//		for(int i=1; i<=20;i=i+2) {
//			sum=sum+i;
//		}
		System.out.println("1에서 20까지의 수 중 홀수 합계 : "+sum);
		for(int j=0; j<11;j++) {
			sum=sum+j;
			j++; //이렇게 해도 되는데 추천X
		}System.out.println(sum);
	}

}
