package com.example.testproject3.coding;

import java.util.HashSet;
import java.util.Set;

public class CodingTest {

    public static void main(String[] args) {
        String s = "abc";

        char[] chars = s.toCharArray();

        Set<Character> set = new HashSet<>();

        for(char c : chars){
            set.add(c);
        }

        System.out.println(chars.length-set.size());
        System.out.println(set);

    }
}
