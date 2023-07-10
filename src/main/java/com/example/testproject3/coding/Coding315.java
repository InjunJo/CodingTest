package com.example.testproject3.coding;

public class Coding315 {

    public static void main(String[] args) {

        int[] arr = {1,5,4,3,2,4,5,2};

        int cnt = 0;

        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[i] == arr[j]) continue;
                ++cnt;
            }
        }

        System.out.println(cnt);

    }

}
