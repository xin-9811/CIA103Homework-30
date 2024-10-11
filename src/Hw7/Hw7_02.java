package Hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Hw7_02 {


	public static void main(String[] agrs) {
		generateRandomNumbers();

	}
//	• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)
	public static void generateRandomNumbers() {
		int[] r = new int[10];
		Random radm = new Random();

		for (int i = 0; i < r.length; i++) {
			r[i] = radm.nextInt(1000) + 1;
		}
//		將數字寫入檔案
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\CIA103_Workspace\\Homework_30\\src\\Hw7\\Data.txt", true))) {
            for (int num : r) {
                writer.write(num + "\n"); 
            }
        } catch (IOException e) {
            System.err.println("寫入檔案時出現錯誤: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("數字已寫入 Data.txt");
		}
	
//	• 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

	public static void copyFile (String a ,String b) throws IOException {
		File sourceFile  = new File (a);
		File destFile =new File(b);
	}

//	• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

//	• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//	型簡化本題的程式設計)

}