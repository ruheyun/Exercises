package cn.ruhe.chapter01;

import java.util.Scanner;

public class Demo03 {
//    4. 输出包括N行，每行只包含一个整数，表示马路上剩余的树的数目。某校大门外长度为L 的马路上有一排树，每两棵相邻的树之间
//    的间隔都是1 米。我们可以把马路看成一个数轴，马路的一端在数轴0 的位置，另一端在L 的位置；数轴上的每个整数点，即0，1，
//    2，……，L，都种有一棵树。
//    由于马路上有一些区域要用来建地铁。这些区域用它们在数轴上的起始点和终止点表示。已知任一区域的起始点和终止点的坐标都是
//    整数，区域之间可能有重合的部分。现在要把这些区域中的树（包括区域端点处的两棵树）移走。你的任务是计算将这些树都移走后，
//    马路上还有多少棵树。
//
//    输入第一行是一个整数N，表示有N组测试数据。
//    每组测试数据的第一行有两个整数L（1 <= L <= 10000）和 M（1 <= M <= 100），L 代表马路的长度，M 代表区域的数目，
//    L 和M 之间用一个空格隔开。
//    接下来的M 行每行包含两个不同的整数，用一个空格隔开，表示一个区域的起始点和终止点的坐标。
//    输出包括N行，每行只包含一个整数，表示马路上剩余的树的数目。
//
//    输入样例:
//            2
//
//            500 3
//            150 300
//            100 200
//            470 471
//
//            10 2
//            3 7
//            6 8
//
//    输出样例
//            298
//            5
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] c = new int[n];
    for (int i = 0; i < n; i++) {
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[l];
        int[][] b = new int[m][2];
        int total = 0;
        for (int x = 0; x < m; x++) {
            b[x][0] = scanner.nextInt();
            b[x][1] = scanner.nextInt();
            for (int y = b[x][0]; y <=b[x][1]; y++){
                if (a[y]!=1){
                    total += 1;
                    a[y] = 1;
                }
            }
        }
        c[i] = l - total + 1;
    }
    for (int i = 0; i < n; i++) {
        System.out.println(c[i]);
    }
}
}
