package com.example.testproject3.coding;

public class Coding197 {

    public static void main(String[] args) {

        int[] arr = {8,3,7,9,2};
        int[] parts = {5,7,9};


        for(int i : parts){

            if(binarySearch(arr,i) == -1){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }

        }

    }

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start < end){

            int mid = (end+start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] >= target){

                end = mid-1;
            }else{
                start = mid + 1;
            }
        }

        return -1;

    }

}
