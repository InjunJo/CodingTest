package com.example.testproject3;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BfsProgrammers {

    static boolean check = false;

    static final int[] dx = {-1,1,0,0};
    static final int[] dy = {0,0,-1,1};

    public static void main(String[] args) {

        String[] map = {"SXXOX", "EXXXL", "OOXOO", "OXXXX", "OOOOO"};

        int[][] arr = new int[map.length][map.length];

        String s = "";
        String l = "";
        String e = "";

        for(int i=0; i<map.length; i++){

            for(int j=0; j<map.length; j++){

                if(map[i].charAt(j) == 'X'){
                    arr[i][j] = -1;
                }
            }


            if(map[i].contains("S")){

                int idx = map[i].indexOf("S");
                s = i+" "+idx;

            }

            if(map[i].contains("L")){
                int idx = map[i].indexOf("L");
                l = i+" "+idx;

            }

            if(map[i].contains("E")){
                int idx = map[i].indexOf("E");
                e = i+" "+idx;
            }

        }

        int x = Integer.parseInt(s.split(" ")[0]);
        int y = Integer.parseInt(s.split(" ")[1]);

        Node lever = new Node(Integer.parseInt(l.split(" ")[0]),Integer.parseInt(l.split(" ")[1]));
        Node end = new Node(Integer.parseInt(e.split(" ")[0]),Integer.parseInt(e.split(" ")[1]));

        System.out.println(bfs(arr,x,y,lever,end));

    }

    public static int bfs(int[][] arr, int x, int y, Node lever, Node end){

        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(x,y));

        while (!queue.isEmpty()){

            Node node = queue.poll();

            x = node.getX();
            y = node.getY();

            for(int i=0; i<4; i++){

                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx <0 || ny <0 || nx >= arr.length || ny >= arr.length) continue;

                if(arr[nx][ny] == -1) continue;

                arr[nx][ny] = arr[x][y]+1;
                Node nextNode = new Node(nx,ny);


                if(lever.equals(nextNode)){
                    check = true;
                }

                if(end.equals(nextNode)&& check){
                    return arr[nx][ny];
                }
                queue.offer(nextNode);
            }
        }

        return -1;
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

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node node = (Node) o;
            return x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

}
