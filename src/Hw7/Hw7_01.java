/*請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料 */

package Hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_01 {

	public static void main(String[] args) {

		File file = new File(".\\src\\Hw7\\Sample.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			long byteCount = file.length(); // 檔案的位元組數
			
			int charCount = 0; // 字元數
			int lineCount = 0; // 行數
			
			String line;
			while ((line = br.readLine()) != null) {
				lineCount++;
				charCount += line.length();
			};

			System.out.println(byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料");

		} catch (IOException e) {
			System.out.println("檔案讀取失敗: " + e.getMessage());

		}

	}
}

//	檢查檔案路徑
//	 String path = ".\\src\\Hw7\\Sample.txt"; 
//     File file = new File(path);
//
//     if (file.exists() && file.isFile()) {
//         System.out.println("路徑正確，檔案存在！");
//     } else {
//         System.out.println("路徑不正確，檔案不存在！");
//     }
