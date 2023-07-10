package com.example.testproject3.coding;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Coding1715 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] card = new int[n];

        for(int i=0; i<n; i++){
            card[i] = scanner.nextInt();
        }

        Arrays.sort(card);

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i: card){
            queue.add(i);
        }

        while (queue.size() != 1){

            int a = queue.remove();
            int b = queue.remove();

            int sum = a+b;

            queue.add(sum);
        }

        System.out.println(queue.poll());

    }

}
