package ex05_1;

class Point{
	int x,y;
	public Point() {
		System.out.println("Point Ŭ���� ����");
	}
}
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point();
		System.out.println(p.getClass().getName());
		System.out.println(p.toString());
		System.out.println(p);
	}

}
