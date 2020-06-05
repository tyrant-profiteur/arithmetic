package com.tyrant.hj003;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author:profiteur
 * @create 2020-06-04 22:41
 * @description 题目描述
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
 * 他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其
 * 中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不
 * 同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找
 * 同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测
 * 试用例里可能会有多组数据，希望大家能正确处理)。
 * <p>
 * Input Param
 * n               输入随机数的个数
 * inputArray      n个随机整数组成的数组
 * Return Value
 * OutputArray    输出处理后的随机整数
 * <p>
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
 * <p>
 * 样例输入解释：
 * 样例有两组测试
 * 第一组是3个数字，分别是：2，2，1。
 * 第二组是11个数字，分别是：10，20，40，32，67，40，20，89，300，400，15。
 * <p>
 * 输入描述:
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 * <p>
 * 输出描述:
 * 返回多行，处理后的结果
 **/
public class HJ003 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;//定义输入的常量
        while (sc.hasNext()){
            Set<Integer> tset = new TreeSet<>();
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                tset.add(sc.nextInt());
            }
            for (Integer integer : tset) {
                System.out.println(integer);
            }
        }
    }
}
