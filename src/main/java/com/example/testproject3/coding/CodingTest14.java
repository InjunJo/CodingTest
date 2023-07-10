package com.example.testproject3.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class CodingTest14 {

    public static void main(String[] args) {

        int[] cost = {1, 2, 3, 2};
        int[] time = {1, 2, 3, 2};

        List<Node> nodeList = new ArrayList<>();

        for(int i=0; i<cost.length; i++){
            nodeList.add(new Node(cost[i], time[i]));
        }

        // Sort tasks in ascending order of cost
        nodeList.sort(Comparator.comparingInt(Node::getCost));

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::getTime).reversed());

        int totalCost = 0;
        int totalTime = 0;

        for (Node task : nodeList) {
            pq.add(task);
            totalTime += task.getTime();
            totalCost += task.getCost();

            // If the total time exceeds the limit, remove the task with the highest time
            if (totalTime > 3) {
                Node temp = pq.poll();
                totalTime -= temp.getTime();
                totalCost -= temp.getCost();
            }
        }

        System.out.println(totalCost);

    }

    static class Node implements Comparable<Node>{
        int cost;
        int time;

        public Node(int cost, int time) {
            this.cost = cost;
            this.time = time;
        }

        public int getCost() {
            return cost;
        }

        public int getTime() {
            return time;
        }

        @Override
        public int compareTo(Node other){
            return Double.compare((double)other.cost/other.time, (double)this.cost/this.time);
        }

        @Override
        public String toString() {
            return "Node{" +
                "cost=" + cost +
                ", time=" + time +
                '}';
        }
    }

}
