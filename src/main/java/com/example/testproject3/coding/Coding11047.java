package com.example.testproject3.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Coding11047 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coin = new int[n];

        for(int i=0; i< n; i++){
            coin[i] = scanner.nextInt();
        }

        int cnt = 0;


        while (k >0){

            int temp = k;

            int max = Arrays.stream(coin).filter(c -> c <= temp).max().getAsInt();

            cnt += k / max;
            k = k % max;
        }

        System.out.println(cnt);


    }

}
