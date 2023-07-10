package com.example.testproject3.coding;

import java.util.Scanner;

public class Coding27465 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long target = n;
        while (isPrime(target)){
            target += 1;
        }
        System.out.println(target);
    }

    public static boolean isPrime(long target){

        for(int i=2; i<=Math.sqrt(target); i++){

            if(target % i == 0){
                return false;
            }
        }

        return true;


    }

}
