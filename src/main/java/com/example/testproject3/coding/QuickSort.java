package com.example.testproject3.coding;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7,5,9,0,3,1,6,2,4,8};

        sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end){
        if(start>=end) return;

        int pivot = start;
        int left = start+1;
        int right = end;

        while(left <= right){

            while (left <= end && arr[left] <= arr[pivot]) ++left;
            while (right > start && arr[right] >= arr[pivot]) --right;

            if(left <= right){

                swap(arr,left,right);
            }else{

                swap(arr,pivot,right);
            }
        }

        sort(arr,start,right-1);
        sort(arr,right+1,end);
    }

    public static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
