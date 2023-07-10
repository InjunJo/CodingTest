package com.example.testproject3.coding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test8 {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {

        int[][] arr = {
            {1,0,1,0,1,0},
            {1,1,1,1,1,1},
            {0,0,0,0,0,1},
            {1,1,1,1,1,1},
            {1,1,1,1,1,1}};

        int result = bfs(arr,0,0);

        System.out.println(result);

    }


    public static int bfs(int[][] arr, int x, int y){

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));

        while (!queue.isEmpty()){
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for(int i=0; i<4; i++){


                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx <0 || nx >= 5 || ny <0 || ny >= 6) continue;

                if(arr[nx][ny] == 0) continue;

                if(arr[nx][ny] == 1){
                    arr[nx][ny] = arr[x][y]+1;
                    queue.add(new Node(nx,ny));
                }
            }

        }

        return arr[4][5];



    }


   static class Node {

        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

       public int getX() {
           return x;
       }

       public int getY() {
           return y;
       }
   }

}
