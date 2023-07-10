package com.example.testproject3.coding;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    private static boolean[] visited;

    private static int max = 0;

    public static void main(String[] args) {
        int N = 100;

        int[][] dungeons = {{100, 1}, {99, 1}, {99, 1}, {99, 1}, {99, 1}, {99, 1}, {99, 1}};

        for(int i=0; i<dungeons.length; i++){

            int temp = N;

            visited = new boolean[dungeons.length];
            visited[i] = true;

            temp -= dungeons[i][1];

            dfs(dungeons,dungeons[i],temp,1);
        }


        System.out.println(max);
    }

    public static void dfs(int[][] dungeons,int[] target,int n,int depth){

        if(depth> max){
            max = depth;
        }

        if(n < target[0] || n <0){

            return;
        }




        for(int i=0; i<dungeons.length; i++){

            if(visited[i]){
                continue;
            }

            n -= target[1];

            if(n <0){
                return;
            }

            visited[i] = true;
            dfs(dungeons,dungeons[i],n,depth+1);
            visited[i] = false;
        }

    }

}
