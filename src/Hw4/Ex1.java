package Hw4;
import java.util.Scanner;

//• 有個一維陣列如下:  {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的 平均值 與 大於平均值 的元素 (提示:陣列,length屬性)

public class Ex1 {
	public static void main(String[] args) {
		int[] Array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int num : Array) {
			sum += num;
		}
		double avg = (double) sum / Array.length;
		System.out.println("平均值為:" + avg);
		System.out.print("大於的元素: ");

		for (int num : Array) {
			if (num > avg) {
				System.out.print(num + " ");
			}
		}	
		System.out.println("");
		System.out.println("==================== ");
	
//• 請建立一個字串,經過程式執行後,輸入結果是反過來的，
//例如String s = “Hello World”,執行結果即為dlroW olleH (提示:String方法,陣列)
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("請輸入反過來文字：");
		String word = sc.nextLine();
		
		String[] strArray = new String[word.length()];

		int i = word.length() - 1; 
		for (int j = 0; j < word.length(); j++) {
			strArray[j] = String.valueOf(word.charAt(i--));
		}

		for (String str : strArray) {
			System.out.print(str);
		}
		System.out.println(); 
		System.out.println("==================== ");
	
	        
//• 有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
	
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowelCount = 0;
		for (String planet : planets) {
          
            for (int j = 0; j < planet.length(); j++) {
                char c = planet.charAt(j);
              
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelCount++;
                        break;
					default:

						break;
					}
				}
			}

			System.out.println("Total number of vowels: " + vowelCount);

		}
	}


