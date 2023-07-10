package com.example.testproject3.coding;

public class TwoPointer2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 5;

        int start = 0;
        int end = 0;
        int cnt = 0;


        while(start < arr.length){

            int sum = sum(arr,start,end);

            if(sum == target){
                ++cnt;
            }

            if(sum < target){
                ++end;
            }else{
                ++start;
            }


        }

        System.out.println(cnt);
    }

    public static int sum(int[]arr, int start, int end){

        int sum = 0;

        for(int i=start; i<= end; i++){

            sum += arr[i];
        }

        return sum;
    }

}
