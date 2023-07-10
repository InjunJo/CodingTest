package com.example.testproject3;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};


    public static void main(String[] args) {

        int[][] arr = {
            {1,0,1,1,1,1},
            {1,0,1,0,1,0},
            {1,0,1,0,1,1},
            {1,1,1,0,1,1}};

        System.out.println(bfs(arr,0,0));
    }

    public static int bfs(int[][] arr, int x, int y){

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x,y));

        while (!queue.isEmpty()){

            Node node = queue.poll();
            x = node.x;
            y = node.y;

            for(int i=0; i<4; i++){

                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx <0 | nx >= 4 | ny <0 | ny >=6) continue;

                if(arr[nx][ny] == 0) continue;

                if(arr[nx][ny] == 1){
                    arr[nx][ny] = arr[x][y]+1;
                    queue.offer(new Node(nx,ny));
                }
            }
        }

        return arr[4-1][6-1];
    }



    static class Node{

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
