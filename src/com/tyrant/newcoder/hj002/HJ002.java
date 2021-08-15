package com.tyrant.newcoder.hj002;

import java.util.Scanner;

/**
 * @author:profiteur
 * @create 2020-06-04 22:14
 * @description
 *  题目描述
 *      写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，
 *      然后输出输入字符串中含有该字符的个数。不区分大小写。
 *  输入描述:
 *      第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 *  输出描述:
 *      输出输入字符串中含有该字符的个数
 **/
public class HJ002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String[] s = new String[2];
        while (sc.hasNext()){
            s[i++] = sc.nextLine();
        }
        int j = getNum(s);
        System.out.println(j);
     }

    private static int getNum(String[] s) {
        String s1 = s[0].toLowerCase();
        String s2 = s[1].toLowerCase();
        char c2 = s2.charAt(0);
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (c2 == s1.charAt(i))
                a++;
        }
        return a;
    }
}
