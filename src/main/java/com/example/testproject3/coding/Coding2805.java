package com.example.testproject3.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Coding2805 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr[arr.length-1];
        int result = 0;

        while (start <= end){

            int mid = (end+start)/2;
            long sum = 0;

            for (int j : arr) {

                if (j <= mid)
                    continue;

                sum += j-mid;
            }

             if(sum >= m){

                start = mid +1;
                result = mid;
            }else {
                end = mid-1;
            }

        }

        System.out.println(result);



    }

}
