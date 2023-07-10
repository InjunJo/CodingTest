package com.example.testproject3.coding;

import java.util.Scanner;

public class Coding2018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int start = 1;
        int end = 1;
        int cnt = 0;

        while (start <= N){

            int sum = 0;

            for(int i=start; i<= end; i++){

                sum += i;
            }

            if(sum < N){
                ++end;
            }else{
                ++start;
            }

            if(sum == N){
                ++cnt;
            }
        }

        System.out.println(cnt);

    }

}
