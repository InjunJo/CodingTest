package com.example.testproject3.coding;

public class Coding113 {

    public static void main(String[] args) {

        int n = 5;

        // 05시 59분 59초

        int hour = 0;
        int minute = 0;
        int second = 0;

        int cnt = 0;



        for(int h=0; h<=n; h++){
            for(int m=0; m<60; m++){
                for(int s=0; s<60; s++){
                    String str = h+"시"+m+"분"+s+"초";
                    if(str.contains("3")){
                        System.out.println(str);
                        ++cnt;
                    }
                }
            }


        }

        System.out.println(cnt);

    }

}
