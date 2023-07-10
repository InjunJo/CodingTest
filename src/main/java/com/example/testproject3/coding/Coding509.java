package com.example.testproject3.coding;

import java.util.Collections;
import java.util.List;

public class Coding509 {

    public static void main(String[] args) {

        List<Integer> arrayList = List.of(1,1,2,3,9);

//        Collections.sort(arrayList);

        int target = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            // 만들 수 없는 금액을 찾았을 때 반복 종료
            if (target < arrayList.get(i)) break;
            target += arrayList.get(i);
        }

        System.out.println(target);


    }

}
