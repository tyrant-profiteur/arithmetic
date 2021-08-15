package com.tyrant.newcoder.hj001;

import java.util.Scanner;

/**
 * @author:profiteur
 * @create 2020-06-04 22:04
 * @description:
 *  题目描述
 *      计算字符串最后一个单词的长度，单词以空格隔开
 *  输入描述:
 *      一行字符串，非空，长度小于5000。
 *  输出描述:
 *      整数N，最后一个单词的长度。
 **/
public class HJ001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = "";
        while (sc.hasNext()){
            word = sc.nextLine();
            System.out.println(getLastWordLen(word));
        }
     }

     static int getLastWordLen(String str){
        str = str.trim();
        String[] s = str.split(" ");
        return s[s.length - 1].length();
     }
}
