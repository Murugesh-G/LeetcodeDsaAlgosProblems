package com.mgleetcode.array.easy;

public class LC1572_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        LC1572_Matrix_Diagonal_Sum obj = new LC1572_Matrix_Diagonal_Sum();
        int[][] arr = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] arr2=new int[][]{{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};
        System.out.println(obj.diagonalSum(arr2));
    }

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
            sum += mat[i][i];
        for (int j = mat.length - 1, i = 0; j >= 0 && i < mat.length; j--, i++)
            sum += mat[i][j];
        if (mat.length % 2 != 0) {
            int mid = mat.length / 2;
            sum -= mat[mid][mid];
        }
        return sum;
    }
}
