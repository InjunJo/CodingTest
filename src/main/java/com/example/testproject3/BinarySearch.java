package com.example.testproject3;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {0,2,4,6,8,10,12,14,16,18};

        System.out.println(binarySearch(arr,0));
    }

    private static int binarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        while (start<= end){

            int mid = (end+start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if(arr[mid] >= target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

}
