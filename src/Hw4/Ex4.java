//班上有8位同學,他們進行了6次考試結果如下:請算出每位同學考最高分的次數
package Hw4;
public class Ex4 {
	public static void main(String[] args) {
		

int [][] score = { {10, 35, 40, 100, 90, 85, 75, 70},
		 {37, 75, 77, 89, 64, 75, 70, 95},
		 {100, 70, 79, 90, 75, 70, 79, 90},
		 {77, 95, 70, 89, 60, 75, 85, 89},
		 {98, 70, 89, 90, 75, 90, 89, 90},
		 {90, 80, 100, 75, 50, 20, 99, 75}};

	  int max = 0;
	  int [] std = new int [8];
	  
	  int index=0;
	  
	  for (int i= 0;i <score.length;i++) {
		  for (int j = 0 ; j < score[i].length; j++) {
			  if (score[i][j] > max) {
				  max = score [i][j];
				  index = j;
			  }
		  }
		 std[index]++;
		 max = 0;
		 index = 0 ;

			for (int j = 0; j < score[i].length; j++) {
				if (score[i][j] == max) {
					std[j]++;
				}
			}
		}
	  
		for (int i = 0; i < std.length; i++) {
			System.out.println((i + 1) + "號同學" + " 最高分數； " + std[i] + " 次");

		}
	}
}