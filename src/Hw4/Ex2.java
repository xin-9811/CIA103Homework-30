package Hw4;
import java.util.Scanner;
//• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」 (提示:Scanner,二維陣列)

public class Ex2 {
	public static void main(String[] args) {
	
		int[][]intArray= 
				{ 
				{25,32,8,19,27},
				{2500,800,500,1000,1200}
				};
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("請輸入預借金額：");
			int loan = sc.nextInt();

			StringBuilder employees = new StringBuilder();
			
			int count = 0;
			
			for (int i = 0 ; i < intArray[0].length ; i++ ) {
				
				if(intArray[1][i]>=loan) {
					
					if(employees.length()>0){
						employees.append(" ");
						
				}
					employees.append(intArray[0][i]);
					count++;

				}
			}
			System.out.println("可借員工編號：" + employees + "共" + count + "人~");
		}

	}

}
