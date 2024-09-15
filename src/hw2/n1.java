package Hw2;

//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

public class n1 {
	public static void main(String[] agrs) {

		int i = 0, sum = 2;
		do {
			i += sum;
			sum += 2;
		} while (sum <= 1000);

		System.out.println("偶數總和:" + i);

//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum1 = 1;
		for (int a = 1; a <= 10; a++)
			sum1 *= a;
		System.out.println("FOR迴圈連乘積："+sum1);

//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int sum2 = 1, count = 1;
		while (count <= 10) {
			sum2 *= count;
			count++;
		}
		System.out.println("while迴圈連乘積："+sum2);
	

//• 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100 (3,5,7,9,11
		
		for (int x = 1; x<=10; x++) {		
			int sum3=x * x;
			System.out.println(sum3 + " ");
		}

	}
}
