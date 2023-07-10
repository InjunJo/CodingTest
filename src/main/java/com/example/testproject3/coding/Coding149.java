package com.example.testproject3.coding;

import java.util.LinkedList;
import java.util.Queue;

public class Coding149 {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        int cnt = 0;

        int[][] arr = {
            {0,0,1,1,0},
            {0,0,0,1,1},
            {1,1,1,1,1},
            {0,0,0,0,0}};

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){

                if(arr[i][j] != 1){

                    ++cnt;
                    bfs(arr,i,j);
                }

            }

        }

        System.out.println(cnt);


    }

    public static void bfs(int[][] arr, int x, int y){

        if(arr[x][y] == 1) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));

        while (!queue.isEmpty()){

            Node node = queue.remove();

            x = node.x;
            y = node.y;

            for(int i=0; i<4; i++){

                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx <0 | ny <0 | nx >= arr.length | ny >= arr[i].length) continue;
                if(arr[nx][ny] == 1) continue;

                if(arr[nx][ny] == 0){

                    arr[nx][ny] = 1;
                    queue.add(new Node(nx,ny));
                }

            }


        }


    }

    static class Node{

        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

}
