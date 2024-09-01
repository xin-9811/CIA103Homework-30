package Hw3;
import java.util.Scanner;
//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數。
public class N3 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入不想要的數字（1~9）：");
		int unnumber = sc.nextInt();

		if (unnumber < 1 || unnumber > 9) {
			System.out.println("請輸入1~9!!!");
		}

		int min = 1, max = 49, count = 0;
		for (int i = min; i <= max; i++) {
			int unit = i % 10;
			int tens = i / 10;

			if (unit != unnumber && tens != unnumber) {
				System.out.print(i + " ");
				count++;
			}
			sc.close();
		} 
		System.out.println();
		System.out.println("可選擇：" + count + "個");
	}
}