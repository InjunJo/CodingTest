package com.example.testproject3.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Coding201 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);
        long start = 0;
        long end = arr[arr.length-1];

        while (start <= end){

            long mid = (end+start)/2;

            long sum = 0;

            for(int i=0; i<n; i++){

                if(arr[i] - mid > 0){
                    sum += arr[i]-mid;
                }
            }

            if(sum == m) {
                System.out.println(mid);
                break;
            }else if(sum >= m){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }


    }

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        int result = 0;

        while (start <= end){
            int mid = (end+start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] >= target){

                end = mid-1;
            }else{
                start = mid + 1;
            }

            result = mid;
        }

        return result;

    }

}
