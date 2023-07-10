package com.example.testproject3.coding;

public class CodingTest272 {

    public static void main(String[] args) {

        String str = "His comments came after Pyongyang announced it had a plan to fire four missiles near the US territory of Guam.";
        String answer = "";
        boolean[] checkList = new boolean[26];
        str = str.toLowerCase();

        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++){

            if(chars[i]>= 'a' && chars[i]<='z'){
                int idx = chars[i] - 97;
                checkList[idx] = true;
            }
        }

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<checkList.length; i++){

            if(!checkList[i]){
                builder.append((char)(i+97));
            }
        }


        if(builder.length() == 0){
            answer = "perfect";
        }else{
            answer = builder.toString();
        }


    }

}
