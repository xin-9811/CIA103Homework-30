package Hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		
		MyRectangle m1 = new MyRectangle(10,20);
		System.out.println(m1.getArea());
		
		m1.setWidth(30);
		m1.setDepth(20);
		m1.getArea();
		
		System.out.println(m1.getArea());
	}
}
