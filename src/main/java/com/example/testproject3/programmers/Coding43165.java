package com.example.testproject3.programmers;

public class Coding43165 {

    private static int cnt = 0;

    public static void main(String[] args) {

        //[4, 1, 2, 1]	4	2

        int[] numbers = {1,1,1,1,1};
        int target = 3;

        dfs(numbers,0,0,numbers[0],target);
        dfs(numbers,0,0,-numbers[0],target);

        System.out.println(cnt);
    }

    public static void dfs(int[] numbers,int idx,int sum,int start,int target){


        sum += start;
        ++idx;

        if(idx > numbers.length-1){

            if(sum == target){
                ++cnt;
            }

            return;
        }

        dfs(numbers,idx,sum,+numbers[idx],target);
        dfs(numbers,idx,sum,-numbers[idx],target);
    }


    public int solution(int[] numbers, int target) {
        int answer = 0;
        return answer;
    }

}
