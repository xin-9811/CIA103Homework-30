package Hw3;

import java.util.Scanner;
//請設計一隻程式,使用者輸入三個數字後, 輸出結果會為"正三角形"、"等腰三角形"、"其它三角形"或"不是三角形"
public class N1 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double[] sides = new double[3];

     System.out.println("請依序輸入三個數字");

     for (int i = 0; i < sides.length; i++) {
         System.out.print("輸入第 " + (i + 1) + " 個數字：");
         sides[i] = sc.nextDouble();
     }

     if (sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[0]) {
         // 檢查三角形類型
         if (sides[0] == sides[1] && sides[1] == sides[2]) {
             System.out.println("正三角形");
         } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
             System.out.println("等腰三角形");
         } else {
             System.out.println("其它三角形");
         }
     } else {
         System.out.println("不是三角形");
     }

     sc.close();
 }
}
    
