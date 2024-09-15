package Hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[]agrs) {
	
	Scanner sc= new Scanner(System.in);
	int x,y;
	
	try {
	System.out.println("請輸入x值");
	x=sc.nextInt();
	
	System.out.println("請輸入y值");
	y=sc.nextInt();
	
	 Calculator.powerXY(x, y);
	}catch(CalException e){
		System.out.println(e.getMessage());
		
	}finally {
		sc.close(); 
	}
}

}

