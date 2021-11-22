package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
    }
}
//    double beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//    double afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//    double secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
class complete {
    /*
    Baekjoon 2606
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<Integer>[] list = new ArrayList[N+1];
        boolean[] visit = new boolean[N+1];

        for(int i=0; i< list.length; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }

        for(int i=0; i<list.length; i++){
            Collections.sort(list[i]);
        }

        dfs(list, visit, 1);
        System.out.println(cnt);
    }

    public static void dfs(List<Integer>[] list, boolean[] visit, int start){
        visit[start] = true;

        for(int i=0; i<list[start].size(); i++){
            if(!visit[list[start].get(i)]){
                cnt++;
                dfs(list, visit, list[start].get(i));
            }
        }
    }
    */
}