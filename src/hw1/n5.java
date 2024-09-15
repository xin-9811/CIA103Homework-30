package Hw1;

//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)

public class n5 {
	public static void main(String[]args) {
		int x =1_500_000;
		double rate =0.02;
		int years=10;
		double total = x*Math.pow(1+rate,years);
		System.out.println("10年後本金："+ String.format("%.3f",total));
	}

}
