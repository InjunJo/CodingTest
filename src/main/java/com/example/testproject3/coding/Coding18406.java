package com.example.testproject3.coding;

import java.util.Scanner;

public class Coding18406 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String str = scanner.nextInt()+"";

       int leftSum = 0;
       int rightSum = 0;

       int midIdx = (str.length() -1)/2;

       for(int i = 0; i<=midIdx; i++){
           leftSum += str.charAt(i)-'0';
       }

       for(int i=midIdx+1; i<str.length(); i++){
           rightSum += str.charAt(i)-'0';
       }

       if(leftSum == rightSum){
           System.out.println("LUCKY");
       }else{
           System.out.println("READY");
       }


    }

}
