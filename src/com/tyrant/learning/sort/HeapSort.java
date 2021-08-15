package com.tyrant.learning.sort;

import com.tyrant.Utils;

/**
 * 堆排序
 * 时间复杂度 O(N*logN) 空间复杂度 O(1)
 *
 * @author:profiteur
 * @create 2021-08-14 10:34
 **/
public class HeapSort {
    /*
       连续的数组，完全二叉树的下标关系
       i    左子树    2*i+1
            右子树    2*i+2
            父节点    (i-1)/2
     */
    /*
        堆
        1.是一个完全二叉树
        2.分为大根堆和小根堆
     */
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // method 1
        for (int i = 0; i < arr.length; i++) {  //O(N)
            heapInsert(arr, 0); //O(logN)
        }
        // method 2 整个数组变成大根堆应该使用的方法
        /*for (int i = arr.length - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }*/

        int heapSize = arr.length;
        Utils.swap(arr, 0, --heapSize);
        while (heapSize > 0) {  //O(N)
            heapify(arr, 0, heapSize); // O(logN)
            Utils.swap(arr, 0, --heapSize);//O(1)
        }
    }

    // 某个数在 index 的时候，往上移动 O(lonN)
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[((index - 1) >> 1)]) {
            Utils.swap(arr, index, (index - 1) >> 1);
            index = (index - 1) >> 1;
        }
    }

    // 某个数在 index 的时候，能否往下移动
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) { // 下方还有子节点
            // 俩节点中比较大的，下标给largest
            int largeset = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;

            // 父和子之间，谁的值大，把下标给largest
            largeset = arr[largeset] > arr[index] ? largeset : index;

            if (largeset == index) {
                break;
            }
            Utils.swap(arr, index, largeset);
            // index 下沉，变成原来的子节点中的一个
            index = largeset;
            left = index * 2 + 1;
        }
    }
}