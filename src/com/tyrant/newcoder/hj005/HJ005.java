package com.tyrant.newcoder.hj005;

import java.util.Scanner;

/**
 * @author:profiteur
 * @create 2020-06-05 21:14
 * @description
 * - 题目描述
 *   写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入）
 * - 输入描述:
 *   输入一个十六进制的数值字符串。
 * - 输出描述:
 *   输出该数值的十进制字符串。
 **/
public class HJ005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(Integer.parseInt(sc.nextLine().substring(2),16));
        }
     }
}
