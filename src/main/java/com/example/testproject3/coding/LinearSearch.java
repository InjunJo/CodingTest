package com.example.testproject3.coding;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,3,12,6,4,11};

        int key = 5;

        boolean success = false;

        int i;

        for(i=0; i<arr.length; i++){

            if (arr[i] == key) {
                success = true;
                System.out.println(i);
                break;
            }
        }

        System.out.println(success+" : "+i);

    }

}
