package Hw3;
//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
import java.util.Scanner;

public class N2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random() * 10); 
        System.out.println("開始猜數字吧！");
        
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("請輸入你的猜測（0~9）：");
            int userGuess = sc.nextInt();
            
            if (userGuess < 0 || userGuess > 9) {
            		System.out.println("請輸入0~9!!!");
            		continue;
            }
            
            if (userGuess == random) {
                System.out.println("恭喜猜對！");
                guessedCorrectly = true; 
            } else {
                System.out.println("猜錯囉~~重新輸入：");
            }
        }
        
        sc.close();
    }

}