package com.tyrant.newcoder.hj008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author:profiteur
 * @create 2020-06-06 10:19
 * @description
 * - 题目描述:
 *   数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，
 *   即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * - 输入描述:
 *   先输入键值对的个数然后输入成对的index和value值，以空格隔开
 * - 输出描述:
 *   输出合并后的键值对（多行）
 **/
public class HJ008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num;
        int n;
        Map<Integer,Integer> map = new TreeMap<>();
        while ((num = bf.readLine()) != null){
            n = Integer.parseInt(num);
            for (int i = 0; i < n; i++) {
                String kv = bf.readLine();
                String[] s = kv.split(" ");
                int key = Integer.parseInt(s[0]);
                int value = Integer.parseInt(s[1]);
                if (map.containsKey(key)){
                    map.put(key,value+map.get(key));
                }else{
                    map.put(key,value);
                }
            }
            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
                System.out.println(integerIntegerEntry.getKey() + " " +integerIntegerEntry.getValue());
            }
            map.clear();
        }
     }
}
