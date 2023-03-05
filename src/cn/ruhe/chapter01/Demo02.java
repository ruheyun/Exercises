package cn.ruhe.chapter01;

import java.util.Scanner;

public class Demo02 {
//    2.平均学分绩点
//    平均学分绩点（Grade Point Average，即GPA）是以学分与绩点作为衡量学生学习的量与质的计算单位，以取得一定的学分和平均学分
//    绩点作为毕业和获得学位的标准，实施多样的教育规格和较灵活的教学管理制度。
//    大学里每一门课程都有一定的学分。只有通过这门课的考试，才能获得相应的学分。课程绩点的计算方法通常是：（百分制成绩-50)/10
//    取整。成绩100，对应绩点为5，成绩90~99对应绩点为4，......，成绩60~69对应绩点为1，成绩小于60，对应绩点为0。
//    平均学分绩点的计算方法是：是将学生修过的每一门课程的绩点乘以该门课程的学分，累加后再除以总学分。 平均学分绩点
//    可以作为学生学习能力与质量的综合评价指标之一。请编程计算一个学生的平均学分绩点。
//    输入n表示有n门课程，然后输入n门课程的学分和成绩，学分和成绩都是整数。
//    输出平均学分绩点，保留一位小数。
//    输入样例：
//            3
//            2 95
//            3 85
//            5 75
//    输出样例：（注意结果的数据类型定义，以及格式% .1 f）
//            2.7
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int credit = 0;
    int point = 0;
    for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
        b[i] = scanner.nextInt();
        credit += a[i];
        if (b[i] >= 60){
            point += (b[i] - 50)/10*a[i];
        }
    }
    System.out.println(String.format("%.1f",point*1.00/credit));
}
}
