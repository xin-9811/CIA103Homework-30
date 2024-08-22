package hw2;
//• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
public class n2 {
	public static void main(String[] agrs) {

		int min = 1, max = 49, count = 0;
		System.out.print("可以選擇的數字：");

		for (int i = min; i <= max; i++) {
			int unit = i % 10;
			int tens = i / 10;

			if (unit != 4 && tens != 4) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("共有幾個：" + count);
	
	System.out.println("=================");

//• 請設計一隻Java程式,輸出結果為以下:
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
	for (int n = 10; n > 0; n--) {
		for (int j = 1; j <= n; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
}
