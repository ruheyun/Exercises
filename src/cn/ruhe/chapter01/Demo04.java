package cn.ruhe.chapter01;

import java.util.Scanner;

public class Demo04 {
//   洛谷: P1035 [NOIP2002 普及组] 级数求和
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    double s = 1;
    int n = 1;
    while (s <= k){
        s += (double) 1/n;
        n++;
    }
    System.out.println(n);
}
}
