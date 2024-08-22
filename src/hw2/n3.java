package hw2;
//• 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class n3 {
	public static void main(String[] args) {
		int f1 = 5;
		for (int i = 0; i <= f1; i++) {
			char ch = (char) ('A' + i);
			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}