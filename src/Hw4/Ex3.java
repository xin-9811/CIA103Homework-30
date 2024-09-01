//• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
package Hw4;
import java.util.Scanner;

public class Ex3 {
	private static Scanner scn;

	public static void main(String[] args) {
	
	scn = new Scanner(System.in);
	
	 int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 
	System.out.println("請輸入三個整數(年/月/日)：");
	int year = scn.nextInt();
	int month = scn.nextInt();
	int day= scn.nextInt();
	
	 boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);// 判斷閏年
	 if (isLeapYear)  {
		 daysInMonth[1]  = 29;
	 }
	  if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
          System.out.println("輸入的日期不正確！");
          return;
	  }
	    int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;
        
        System.out.println("輸入的日期為該年第" + dayOfYear + "天");
	
}
}
