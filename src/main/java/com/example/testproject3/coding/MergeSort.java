package com.example.testproject3.coding;

import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {1,3,12,6,4,11}; // 1,3,4,6,11,12
                    //0,1,2,3,4,5

        merge_sort(arr,0,arr.length-1);
    }

    static void merge_sort(int[] arr,int first, int end){

        if(first < end){
            int mid = (end+first)/2;

            merge_sort(arr,first,mid);
            merge_sort(arr,mid+1,end);
        }else{


        }
    }
}
