package com.example.testproject3.coding;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Coding1744 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        Queue<Integer> negative = new ArrayDeque<>();
        Stack<Integer> positive = new Stack<>();

        for (int j : arr) {

            if (j <= 0) {
                negative.add(j);
            } else {
                positive.add(j);
            }
        }

        int sum = 0;

        while (negative.size() >= 2){

            int a = negative.remove();
            int b = negative.remove();

            sum += a * b;
        }

        if(!negative.isEmpty()){
            sum += negative.poll();
        }

        while (positive.size() >= 2){

            int a = positive.pop();
            int b = positive.pop();

            if(a == 1 | b == 1){
                sum += a+b;
            }else{
                sum += a * b;
            }
        }

        if(!positive.isEmpty()){
            sum += positive.pop();
        }

        System.out.println(sum);

    }

}
