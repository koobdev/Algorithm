package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String six = "666";
        int[] minArr = new int[N];

        // 66612
        // 16662
        // 12666
        for(int i=0; i<N; i++){
            String target = Integer.toString(i);
            String[] arr = new String[target.length()+1];
            int min = 0;
            for(int j=0; j<=target.length(); j++){
                int index = 0;
                String num = "";

                for(int k=0; k<=target.length(); k++){
                    if(k == j){
                        arr[k] = six;
                    }else {
                        String s = Character.toString(target.charAt(index));
                        arr[k] = s;
                        index++;
                    }
                }

                for(int k=0; k<arr.length; k++){
                    num += arr[k];
                }

                if(min == 0){
                    min = Integer.parseInt(num);
                }else {
                    if(min > Integer.parseInt(num)){
                        min = Integer.parseInt(num);
                    }
                }
            }

            minArr[i] = min;
        }

        Arrays.sort(minArr);
        for(int i=0; i<N; i++){
            System.out.println(minArr[i]);
        }
    }
}

class complete {
    /*
    Baekjoon 2798
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    StringTokenizer numbers = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    int result = 0;

    for(int i=0; i<N; i++){
        arr[i] = Integer.parseInt(numbers.nextToken());
    }

    for(int i=0; i<N; i++){
        for(int j=i+1; j<N; j++){
            for(int k=j+1; k<N; k++){
                int tmp = arr[i] + arr[j] + arr[k];
                if(tmp <= M && tmp > result){
                    result = tmp;
                }
            }
        }
    }

    System.out.println(result);
    */

    /*
    Baekjoon 2231
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int result = N;

    for(int i=0; i<N; i++){
        String s = Integer.toString(i);
        int sum = Integer.parseInt(s);
        for(int j=0; j<s.length(); j++){
            sum += s.charAt(j)-'0';
        }

        if(sum == N && result > i){
            result = i;
        }
    }
    System.out.println(result);
    */

    /*
    Baekjoon 7568
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] weight = new int[N];
    int[] height = new int[N];
    int[] rank = new int[N];

    for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        weight[i] = Integer.parseInt(st.nextToken());
        height[i] = Integer.parseInt(st.nextToken());
    }

    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            if(i != j && weight[i] < weight[j] && height[i] < height[j]){
                rank[i]++;
            }
        }
    }

    for(int i=0; i<rank.length; i++){
        System.out.print((rank[i]+1) + " ");
    }
    */

    /*
    Baekjoon 1018 - 체스판

    */

    /*
    Baekjoon 1436

    */
}