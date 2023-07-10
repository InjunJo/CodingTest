package com.example.testproject3.coding;

import java.util.*;

public class Hackerland {

    static class Task {
        int time;
        int cost;

        public Task(int cost, int time) {
            this.cost = cost;
            this.time = time;
        }
    }

    public static void main(String[] args) {

        int[] cost = {1, 1, 3, 4};
        int[] time = {3, 1, 2, 3};

        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < cost.length; i++) {
            tasks.add(new Task(cost[i], time[i]));
        }

        // sort tasks in descending order of time. If two tasks have the same time, sort in ascending order of cost.
        tasks.sort((a, b) -> a.time == b.time ? a.cost - b.cost : b.time - a.time);

        // use a min-heap to keep track of the tasks with the smallest cost that we have seen but not yet processed.
        PriorityQueue<Task> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));

        int totalCost = 0;
        for (Task task : tasks) {
            totalCost += task.cost;
            heap.add(task);
            if (heap.size() > task.time) {
                // remove the task with the smallest cost from the heap
                totalCost -= heap.poll().cost;
            }
        }

        System.out.println(totalCost);
    }
}
