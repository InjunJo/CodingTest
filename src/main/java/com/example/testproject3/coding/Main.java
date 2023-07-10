package com.example.testproject3.coding;

import java.util.*;

class Task implements Comparable<Task>{
    int cost;
    int time;

    Task(int cost, int time){
        this.cost = cost;
        this.time = time;
    }

    // Sort tasks in decreasing order of cost/time ratio
    @Override
    public int compareTo(Task other){
        return Double.compare((double)other.cost/other.time, (double)this.cost/this.time);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] cost = {1, 1, 3, 4};
        int[] time = {3, 1, 2, 3};

        System.out.println(getMinCost(cost, time));
    }

    public static int getMinCost(int[] cost, int[] time) {
        int n = cost.length;
        List<Task> tasks = new ArrayList<>();

        for(int i = 0; i < n; i++){
            tasks.add(new Task(cost[i], time[i]));
        }

        // Sort the tasks in decreasing order of cost/time ratio
        Collections.sort(tasks);

        // Find the task with maximum time
        int maxTime = 0;
        for(int i = 0; i < n; i++){
            maxTime = Math.max(maxTime, tasks.get(i).time);
        }

        int totalCost = 0;
        int i = 0;

        // Execute the tasks with highest cost/time ratio on the paid server
        // until we reach a task with time less than or equal to maxTime
        while(i < n && tasks.get(i).time > maxTime){
            totalCost += tasks.get(i).cost;
            i++;
        }

        // If there are tasks left, execute the one with maximum time on the paid server
        if(i < n){
            totalCost += tasks.get(i).cost;
        }

        return totalCost;
    }
}
