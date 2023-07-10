package com.example.testproject3.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test10 {

    public static void main(String[] args) {

        int m = 3;
        int sum = 0;

        List<Integer> a = new ArrayList<>(List.of(1, 2, 5, 4, 3));
        List<Integer> b= new ArrayList<>(List.of(5, 5, 6, 6, 5));

        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.reverseOrder());

        for(int i=0; i<m; i++){

            if(a.get(i) < b.get(i)){
                a.set(i,b.get(i));
            }

        }

        for(Integer i : a){
            sum += i;
        }

        System.out.println(sum);

    }

}
