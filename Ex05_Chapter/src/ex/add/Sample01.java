package ex.add;

public class Sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=1;i<101;i++) {
			sum=sum+i;
			i++;
			sum=sum-i;
		}
		System.out.println(sum);
	}

}