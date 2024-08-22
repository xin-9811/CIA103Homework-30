package hw2;
//• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

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

public class n2 {
public static void main(String[]agrs) {

	System.out.print("阿文可以選擇的數字有哪些?");

	for (int i = 1; i <= 49; i++) {
		int ten = i / 10; // 取十位數
		int units = i % 10; // 取個位數

		if (ten != 4 && units != 4) {

			System.out.print(i + " ");
		}

	}

}
}

//
//        // 结果存储的数组
//        int[] validNumbers = new int[49];
//        int count = 0; // 记录符合条件的数字个数
//
//        // 遍历1到49的数字
//        for (int i = 1; i <= 49; i++) {
//            if (!containsFour(i)) {
//                validNumbers[count++] = i;
//            }
//        }
//
//        // 打印符合条件的数字
//        System.out.println("阿文可以选择的数字有哪些?");
//        for (int i = 0; i < count; i++) {
//            System.out.print(validNumbers[i] + " ");
//        }
//
//        // 打印符合条件的数字总数
//        System.out.println("\n总共有 " + count + " 个数字。");
//    }
//
//    // 检查数字是否包含4
//    private static boolean containsFour(int number) {
//        return String.valueOf(number).contains("4");
//    }
//}
