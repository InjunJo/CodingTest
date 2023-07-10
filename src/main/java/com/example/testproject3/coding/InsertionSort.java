package com.example.testproject3.coding;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {11, 6, 4, 3, 2, 1};


        for(int i=1; i<arr.length; i++){

            for(int j=i; j>0; j--){

                if(arr[j-1] > arr[j]){

                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
