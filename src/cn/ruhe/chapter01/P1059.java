package cn.ruhe.chapter01;

import java.util.Scanner;

public class P1059 {
//    P1059 [NOIP2006 普及组] 明明的随机数
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
        a[i] = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            if (a[i] == a[j]){
                N = N - 1;
                i = i - 1;
            }
        }
    }
    for (int i = 0; i < N; i++) {
        for (int j = i; j < N; j++) {
            if (a[i] > a[j]){
                int b = 0;
                b = a[i];
                a[i] = a[j];
                a[j] = b;
            }
        }
    }
    System.out.println(N);
    for (int i = 0; i < N; i++) {
        System.out.print(a[i] + " ");
    }
}
}
