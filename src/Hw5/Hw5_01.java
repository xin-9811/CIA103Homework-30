//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形。
package Hw5;
import java.util.Random;
import java.util.Scanner;

public class Hw5_01 {
	   public static void main(String[] args) {
	        Scanner scn= new Scanner(System.in);
	        System.out.println("請輸入寬與高(例如:4,5):");
	        
	        String input = scn.nextLine();
	        
	        String [] parts = input.split(",");
	        
	        int width = Integer.parseInt(parts[0]);
            int height = Integer.parseInt(parts[1]);
            
            starSquare(width, height);
            
            
            randAvg();
            
	   }
	   
	public static void starSquare (int width, int height) {
		for (int i = 0 ; i < height ; i++){
			for (int j = 0; j < width ; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		}
	
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值。
	
			public static void randAvg() {
			
			Random r = new Random();
			int [] numbers = new int [10];
			int sum = 0 ;
			
			for ( int a = 0 ; a < numbers.length ; a ++) {
				
				numbers[a] = r.nextInt(101);
				sum += numbers[a];
			}
				System.out.println("亂數結果：");
				
				double avg = (double)sum / numbers.length;
				for(int number : numbers) {
			
				System.out.print (number + " ");			
			}
				System.out.println();
		        System.out.println("平均：" + avg);
	}

}
