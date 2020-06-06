package com.tyrant.hj007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:profiteur
 * @create 2020-06-06 10:12
 * @description
 * - 题目描述:
 *   写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * - 输入描述:
 *   输入一个正浮点数值
 * - 输出描述:
 *   输出该数值的近似整数值
 **/
public class HJ007 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Double d = Double.parseDouble(bf.readLine());
        int i = (int)(d+0.5);
        System.out.println(i);
     }
}
