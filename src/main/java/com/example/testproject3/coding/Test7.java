package com.example.testproject3.coding;

public class Test7 {

    private static int sum = 0;

    private static boolean[] visited;

    public static void main(String[] args) {

        //ABCDEFGHIJKLMNOPQRSTUVWXYZ

        String str = "JAN";
        //알파벳 26개

        visited = new boolean[str.length()];

        char[] chars = str.toCharArray();

        for(int i=0; i<1; i++){

            visited[i] = true;

        }

        cursor(str);

        System.out.println(sum);
    }

    public static void moveDfs(char[] chars, boolean[] visited,int target){

        if(visited[target]){
            return;
        }

        for(int i=0; i<chars.length; i++){

            moveDfs(chars,visited,chars[i]);
        }


    }

    public static void cursor(String str){

        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++){


            int a = Math.abs(chars[i]-'A');
            int b = Math.abs('Z'-chars[i]+1);

            if(a > b){
                System.out.println("b : "+b);
                sum += b;
            }else{
                System.out.println("a : "+a);
                sum += a;
            }
        }

    }

    public static int solution(String name) {
        int answer = 0;
        return answer;
    }

}
