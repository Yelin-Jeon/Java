package ex.add;

public class Sample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int sw=1;
		for(int i=1;i<101;i++) {
			
			if(sw==1) {
				sum=sum+i;
			}else {
				sum=sum-i;
			}
			sw=-sw;
		}
		System.out.println(sum);
	}

}
