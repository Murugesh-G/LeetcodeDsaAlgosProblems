package com.mgleetcode.sortingalgorithms;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] arr=new int[]{4,9,1,5,2};
        System.out.println(Arrays.toString(obj.bubbleSort(arr)));
    }

    int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}