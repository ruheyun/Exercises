package cn.ruhe.chapter01;

public class Demo01 {
//    1.输出一个4*4（乘积）矩阵 (while，if，for等语句）
//            样例输出：
//            1   2   3   4
//            2   4   6   8
//            3   6   9   12
//            4   8   12  16
//            注：%-4d输出整型数据，占四个字节，然后空格在右侧补齐
public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print((i + 1) + (i + 1) * j + "\t");
        }
        System.out.println();
    }
}
}
