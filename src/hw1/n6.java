package Hw1;

//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class n6 {

	public static void main(String[]args) {
		System.out.println(5+5); // 5+5 =10
		System.out.println(5+'5'); // '5' 是字符型別，其 ASCII 值為 53，與整數 5 相加。
		System.out.println(5+"5"); // 數字5 加上 字串 "5" 所以為55
	}
		
}