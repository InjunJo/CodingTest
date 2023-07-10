package com.example.testproject3.coding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoPointer {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,5};
        int[] sum = new int[arr.length];

        int target = 5;
        int cnt = 0;

        sum[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            sum[i] = sum[i-1] + arr[i];
        }

        for(int i=0; i<sum.length; i++){

            if(sum[i] == target || arr[i] == target){
                ++cnt;
            }

            for(int j=i+1; j<sum.length-1; j++){

                int a = sum[j]-sum[i];

                if(target == a){
                    ++cnt;
                }
            }
        }

        System.out.println(cnt);

    }

}
