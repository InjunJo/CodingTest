package com.example.testproject3.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Coding2343 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        long start = arr[arr.length-1];
        long end = Arrays.stream(arr).sum();
        long result = 0;

        while (start <= end){

            long mid = (end+start)/2;

            int cnt = 0;
            long sum = 0;

            for(int i : arr){

                if(sum +i > mid){
                    sum = 0;
                    ++cnt;
                }
                sum += i;
            }

            if(sum != 0) {
                ++cnt;
            }

            if(cnt <= m){
                end = mid -1;
                result = mid;
            }else{
                start = mid+1;
            }

        }
        System.out.println(result);
    }

}
