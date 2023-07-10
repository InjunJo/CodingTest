package com.example.testproject3.coding;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CodingTest274 {

    public static void main(String[] args) {

        int[] grade = {3,3,2,1,3,3};
        int[] answer = new int[grade.length];

        List<Node> list = new ArrayList<>();

        for(int i=0; i<grade.length; i++){
            list.add(new Node(i,grade[i]));
        }

        list.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {

                return Integer.compare(o2.getGrade(), o1.getGrade());
            }
        });

        int cnt = 1;
        int max = 0;
        boolean start = true;

        Queue<Node> queue = new ArrayDeque<>();

        queue.addAll(list);

        while (!queue.isEmpty()){

            Node node = queue.poll();

            int idx = node.idx;
            int value = node.grade;

            if(max > value){
                answer[idx] = cnt;
            }else if(max == value){

            }
        }

    }

    static class Node{

        int idx;
        int grade;

        public Node(int idx, int grade) {
            this.idx = idx;
            this.grade = grade;
        }

        public int getIdx() {
            return idx;
        }


        public int getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Node{" +
                "idx=" + idx +
                ", grade=" + grade +
                '}';
        }
    }

}
