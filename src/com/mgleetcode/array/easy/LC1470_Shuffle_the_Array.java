package com.mgleetcode.array.easy;

import java.util.Arrays;

public class LC1470_Shuffle_the_Array {
    public static void main(String[] args) {
        LC1470_Shuffle_the_Array obj=new LC1470_Shuffle_the_Array();
        int[] arr=new int[]{2,5,1,3,4,7};
        System.out.println(Arrays.toString(obj.shuffle(arr,3)));
    }
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }
}
