package com.example.testproject3.coding;

public class CodingTest27 {

    public static void main(String[] args) {

        int n = 100;
        int m = 300;

        int cnt = 0;

        for(int i=n; i<= m; i++){
            boolean palindrome = true;

            String str = i+"";

            int mid = (str.length()-1)/2;

            if(str.length()%2 == 0){

                char[] before = str.substring(0,mid+1).toCharArray();
                char[] after = str.substring(mid+1).toCharArray();

                for(int j=0; j<before.length; j++){

                    if(before[j] != after[after.length-1-j]){
                        palindrome = false;
                        break;
                    }
                }

            }else{

                char[] before = str.substring(0,mid).toCharArray();
                char[] after = str.substring(mid+1).toCharArray();

                for(int j=0; j<before.length; j++){

                    if(before[j] != after[after.length-1-j]){
                        palindrome = false;
                        break;
                    }
                }

            }

            if(palindrome){
                ++cnt;
            }
        }

        System.out.println(cnt);


    }

}
