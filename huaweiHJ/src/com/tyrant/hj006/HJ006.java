package com.tyrant.hj006;

import java.util.Scanner;

/**
 * @author:profiteur
 * @create 2020-06-06 9:15
 * @description - 题目描述:
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子
 * （重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 * - 输入描述:
 * 输入一个long型整数
 * - 输出描述:
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 **/
public class HJ006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Long lg = sc.nextLong();
            if (lg == 1) {
                continue;
            } else if (lg == 2) {
                System.out.print(lg + " ");
            } else{
                getPrimeFactor(lg);
            }
        }
    }

    private static void getPrimeFactor(Long lg) {
        if (lg == 1) return;
        if (lg == 2) {
            System.out.print(lg + " ");
            return;
        }
        for (int i = 2; i <= lg; i++) {
            if (lg % i == 0) {
                System.out.print(i + " ");
                getPrimeFactor(lg / i);
                break;
            }
        }
    }

}
