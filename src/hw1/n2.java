package hw1;

//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class n2 {

	public static void main(String[]args) {
		int egg= 200; int box=12;
		System.out.println("打數:"+egg/box);
		System.out.println("共剩:"+ egg%box);
	}
}