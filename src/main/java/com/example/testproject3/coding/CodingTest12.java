package com.example.testproject3.coding;

public class CodingTest12 {

    public static void main(String[] args) {

        int a = 50;

        String str = Integer.toBinaryString(a);
        StringBuilder flip = new StringBuilder();

        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++){

            if(chars[i] =='0'){
                chars[i] = '1';
                flip.append("1");
            }else{
                chars[i] = '0';
                flip.append("0");
            }
        }

        String str1 = new String(chars);
        int result = Integer.parseInt(str1,2);

        System.out.println(result);


    }

}
