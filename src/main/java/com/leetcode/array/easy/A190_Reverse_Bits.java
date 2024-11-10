package com.leetcode.array.easy;

public class A190_Reverse_Bits {
    public static void main(String[] args) {
        A190_Reverse_Bits obj = new A190_Reverse_Bits();
        //long n=00000010100101000001111010011100L;
        //System.out.println(obj.reverseBits(n));
    }

    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>= 1;
        }
        return res;
    }
}
