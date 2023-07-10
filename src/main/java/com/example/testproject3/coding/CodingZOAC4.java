package com.example.testproject3.coding;

import java.util.Scanner;

public class CodingZOAC4 {

    static int cnt = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[h][w];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                if(arr[i][j] != 1){
                    ++cnt;
                    dfs(arr,i,j,h,w,0,n,m);
                }
            }
        }

        System.out.println(cnt);

    }

    public static void dfs(int[][] arr, int x, int y,int h,int w, int depth,int n, int m){

        if(depth>1) return;
        if(x<0 | y<0 | x> w | y > h) return;
        if(arr[x][y] != 0) return;


        arr[x][y] = 1;
        ++depth;

        dfs(arr,x-n,y,h,w,depth,n,m);
        dfs(arr,x+n,y,h,w,depth,n,m);
        dfs(arr,x,y-m,h,w,depth,n,m);
        dfs(arr,x,y+m,h,w,depth,n,m);
        dfs(arr,x-n,y-m,h,w,depth,n,m);
        dfs(arr,x-n,y+m,h,w,depth,n,m);
        dfs(arr,x+n,y-m,h,w,depth,n,m);
        dfs(arr,x+n,y+m,h,w,depth,n,m);

    }

}
