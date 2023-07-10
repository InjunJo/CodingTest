package com.example.testproject3.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

    private static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=2; i<10; i++){

            if(decimal(i)){
                dfs(i,0,N);

            }
        }
        result.forEach(System.out::println);
    }

    public static void dfs(int target,int depth,int N){

        ++depth;

        if(depth >N){
            return;
        }

        if(depth == N){
            result.add(target);
        }


        for(int i=0; i<10; i++){

            int intNum = Integer.parseInt(target+""+i);

            if (decimal(intNum)){

                dfs(intNum,depth,N);
            }
        }
    }

    public static boolean decimal(int target){

        for(int i=2; i<=target/2; i++){

            if(target % i == 0 && target != i) return false;

        }

        return true;
    }

}
