package com.example.testproject3.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {

        int a = 1000;

        boolean[] arr = new boolean[a+1];

        Arrays.fill(arr,true);

        for(int i=2 ; i<= Math.sqrt(a); i++){

            if(arr[i]){

                int j = 2;

                while (i*j <= a){

                    arr[i*j] = false;
                    ++j;
                }

            }
        }

        for(int i=2; i<arr.length; i++){

            if (arr[i]) {
                System.out.println(i);
            }
        }

    }


    public static boolean isPrime(int target){

        for(int i=2; i<= Math.sqrt(target); i++){

            if(target%i == 0){
                return false;
            }

        }

        return true;

    }

}
