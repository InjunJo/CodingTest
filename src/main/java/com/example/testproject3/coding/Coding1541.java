package com.example.testproject3.coding;

import java.util.Scanner;

public class Coding1541 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] arr = str.split("-");

        int sum = 0;

        boolean first = true;

        for (String item : arr) {

            int temp = 0;
            String[] s = item.split("\\+");

            for (String value : s) {
                temp += Integer.parseInt(value);

            }

            if(first){
                sum += temp;
                first = false;
            }else {
                sum -= temp;
            }

        }

        System.out.println(sum);

    }

}
