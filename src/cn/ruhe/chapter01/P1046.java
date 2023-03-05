package cn.ruhe.chapter01;

import java.util.Scanner;

public class P1046 {
//    P1046 [NOIP2005 普及组] 陶陶摘苹果
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
        a[i] = scanner.nextInt();
    }
    int b = scanner.nextInt();
    int total = 0;
    for (int i = 0; i < 10; i++) {
        if (b + 30 >= a[i]){
            total++;
        }
    }
    System.out.println(total);
}
}
