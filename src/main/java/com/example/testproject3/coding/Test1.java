package com.example.testproject3.coding;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Test1 {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fileReader);

            StringTokenizer tokenizer = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(tokenizer.nextToken());
            int M = Integer.parseInt(tokenizer.nextToken());

            List<Integer>[] list = new ArrayList[N+1];

            for(int i = 1; i<N+1; i++){

                list[i] = new ArrayList<>();
            }


            while (br.ready()){
                tokenizer = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(tokenizer.nextToken());
                int b = Integer.parseInt(tokenizer.nextToken());

                list[a].add(b);
                list[b].add(a);
            }
            System.out.println(Arrays.deepToString(list));
            boolean[] visited = new boolean[7];

            int cnt = 0;

            for(int i=1; i<N+1; i++){
                if(!visited[i]){
                    ++cnt;
                    dfs(list,i,visited);
                }

            }

            System.out.println(cnt);




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void dfs(List<Integer>[] list, int target, boolean[] visited){

        if(visited[target]){
            return;
        }

        List<Integer> node = list[target];

        visited[target] = true;

        for(int i=0; i<node.size(); i++){

            Integer a = node.get(i);

            dfs(list,a,visited);
        }
    }


}
