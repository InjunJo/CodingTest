package com.example.testproject3.coding;

import java.util.Scanner;

public class Test313 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        StringBuilder zero = new StringBuilder();
        StringBuilder one = new StringBuilder();

        boolean z = false;
        boolean o = false;

        for(int i=0; i<s.length(); i++){

            if (s.charAt(i) == '0'){

                if(o){
                    one.append(" ");
                    o = false;
                }

                z = true;

                zero.append("0");

            }else{
                if(z){
                    zero.append(" ");
                    z = false;
                }
                o = true;
                one.append("1");
            }

        }

        int zeroLength = zero.toString().split(" ").length;
        int oneLength = one.toString().split(" ").length;

        if(zero.toString().length() ==0 | one.toString().length() == 0){
            System.out.println(0);
        }else{
            System.out.println(Math.min(zeroLength,oneLength));
        }


    }

}
