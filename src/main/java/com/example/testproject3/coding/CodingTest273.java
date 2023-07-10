package com.example.testproject3.coding;

public class CodingTest273 {

    public static void main(String[] args) {
        //2, 2, 1, 1, 1, 2
        int[] x = {2,2,1};
        int[] y = {1,1,2};

        int temp = 0;
        boolean answer = true;

        for(int i=0; i<x.length; i++){

            if(x[i] < y[i]){
                if(temp < y[i]){
                    temp = y[i];
                }
            }
        }

        for(int i=0; i<x.length; i++){

            if(x[i] < y[i]){
                answer = false;
            }
        }

        System.out.println(temp);


    }

}
