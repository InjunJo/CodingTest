package com.example.testproject3.coding;

import java.util.Arrays;
import java.util.Comparator;

public class Coding92 {

    public static void main(String[] args) {

        int[] arr = {3,4,3,4,3};
        int[] cnt = new int[arr.length];

        Arrays.sort(arr);

        int m = 7;
        int k = 2;

        int count = 0;
        int sum = 0;

        int first = arr[arr.length-1];
        int second = arr[arr.length-2];

        int fCnt = (m/k+1)*k + (m%k+1);

        sum = first * fCnt + (second * (m - fCnt));

        System.out.println(sum);

    }

}
