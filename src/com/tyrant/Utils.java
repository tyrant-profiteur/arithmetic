package com.tyrant;

/**
 * @author:profiteur
 * @create 2021-08-14 11:11
 **/
public class Utils {
    public static void swap(int[] arr,int i,int j){
        int deap = arr[i];
        arr[i] = arr[j];
        arr[j] = deap;
    }

    /**
     * 技巧型交换  要保证交换的两个数不相等
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap2(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
