package com.tyrant.newcoder.hj108;

import java.util.Scanner;

/**
 * @author:profiteur
 * @create 2020-06-05 12:17
 * @description
 *  题目描述
 *      正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 *  输入描述:
 *      输入两个正整数A和B。
 *  输出描述:
 *      输出A和B的最小公倍数。
 **/

/**
 * 思路：
 *  最小公倍数：a * b / 最大公约数
 *  最大公约数：辗转相除法（欧几里得算法）：两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数
 *      a(大),b  a % b == 0 即 a 是 b 的倍数，b 为 a，b 的最大公约数
 *      否则 b 赋值给 a，a % b（r）赋值给b，此时 b 一定比 a 小，（a % b < b），重复操作
 *  证明: a = kb + r r = a%b
 *        d 为 a,b 的一个公约数
 *        r = a - kb
 *        r/d = a/d - kb/d = m
 *        由右边知 m 为整数
 *        所以 d 为 r 的公约数
 */
public class HJ108 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiple = getMinMultiple(a,b);
        System.out.println(multiple);
     }

    private static int getMinMultiple(int a, int b) {
        if (a < b){
            int c = a;
            a = b;
            b = c;
        }
        int maxMeasure = getMaxMeasure(a,b);
        return a* b /maxMeasure;
    }

    private static int getMaxMeasure(int a, int b) {
        if (a % b == 0) return b;
        return  getMaxMeasure(b,a % b);
    }
}
