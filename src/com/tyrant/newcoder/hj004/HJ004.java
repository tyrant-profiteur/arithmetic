package com.tyrant.newcoder.hj004;

import java.util.Scanner;

/**
 * @author:profiteur
 * @create 2020-06-05 20:33
 * @description - 题目描述
 * - 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * - 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * - 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * - 输出描述:
 * 输出到长度为8的新字符串数组
 **/
public class HJ004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        getSplitChar(a);
        getSplitChar(b);
    }

    private static void getSplitChar(String a) {
        int r = a.length() % 8;
        int t = (int)Math.ceil((double)a.length() / (double) 8);
        String[] s = new String[t];
        for (int i = 0; i < t - 1; i++) {
            s[i] = a.substring(i * 8, (i + 1) * 8);
        }
        StringBuffer sb = new StringBuffer(a.substring((t-1)*8));
        if (r != 0){
            for (int i = 0; i < 8 - r; i++) {
                sb.append(0);
            }
        }
        s[t-1] = sb.toString();
        for (int i = 0; i < t; i++) {
            System.out.println(s[i]);
        }
    }
}
