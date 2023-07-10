package com.example.testproject3.programmers;

import java.util.ArrayDeque;
import java.util.Queue;

public class Coding1844 {

    private static int[] px = {-1,1,0,0};
    private static int[] py = {0,0,-1,1};

    public static void main(String[] args) {

        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,1}};

        bfs(maps,0,0);

        int result = maps[maps.length-1][maps[maps.length-1].length-1];

        if(result == 1){
            result = -1;
        }



        System.out.println(result);

    }

    public static void bfs(int[][] maps,int x, int y){

        Queue<Node> queue = new ArrayDeque<>();

        queue.add(new Node(x,y));

        while (!queue.isEmpty()){

            Node node = queue.remove();
            x = node.x;
            y = node.y;

            for(int i=0; i<4; i++){

                int nx = node.x+px[i];
                int ny = node.y+py[i];

                if(nx <0 || ny <0 || nx > maps.length-1 || ny > maps[maps.length-1].length-1) continue;
                if(maps[nx][ny] == 0) continue;

                if(maps[nx][ny] == 1){
                    maps[nx][ny] = maps[x][y]+1;
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
