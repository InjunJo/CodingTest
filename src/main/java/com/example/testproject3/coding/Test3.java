package com.example.testproject3.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {

    private static boolean alive = false;


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int N = scanner.nextInt();
            int M = scanner.nextInt();

            List<Integer>[] list = new ArrayList[N];

            for(int i = 0; i<N; i++){

                list[i] = new ArrayList<>();
            }


            while (scanner.hasNext()){

                int a = scanner.nextInt();
                int b = scanner.nextInt();

                list[a].add(b);
                list[b].add(a);
            }
            boolean[] visited = new boolean[N];

            for(int i=0; i<N; i++){
                dfs(list,i,visited,0);
            }

            if(alive){
                System.out.println(1);
            }else{
                System.out.println(0);
            }



    }

    public static void dfs(List<Integer>[] list, int target, boolean[] visited,int depth){

        if(visited[target]){
            return;
        }

        if(depth == 4){
            alive = true;
        }

        List<Integer> a = list[target];

        visited[target] = true;

        for(int i=0; i<a.size(); i++){
            dfs(list,a.get(i),visited,depth+1);
        }

    }

}
