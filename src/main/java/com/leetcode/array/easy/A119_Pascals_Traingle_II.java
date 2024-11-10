package com.leetcode.array.easy;

import java.util.Arrays;
import java.util.List;

public class A119_Pascals_Traingle_II {
    public static void main(String[] args) {
        A119_Pascals_Traingle_II obj = new A119_Pascals_Traingle_II();
        int rowIndex = 4;
        System.out.println(obj.getRow(rowIndex));
    }

    public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex + 1];
        Arrays.fill(result, 0);
        result[0]=1;

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                result[j] = result[j - 1] + result[j];
            }
        }
        return Arrays.asList(result);
    }
}
