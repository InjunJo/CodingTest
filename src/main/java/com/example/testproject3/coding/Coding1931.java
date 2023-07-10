package com.example.testproject3.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Coding1931 {

    public static void main(String[] args) {

        Integer[][] arr = {{1,4},{3,5},{0,6},{5,7},{3,8},{5,9},{6,10},{8,11},{8,12},{2,13},{12,14}};
        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });

        System.out.println(Arrays.deepToString(arr));

        int cnt = 0;
        int end = -1;

        for(int i=0; i<arr.length; i++){

            if(arr[i][0] >= end){
                ++cnt;
                end = arr[i][1];
            }

        }

        System.out.println(cnt);

    }

}
