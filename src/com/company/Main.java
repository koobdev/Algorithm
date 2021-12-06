package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(count);

    }

    public static void nQueen(int depth) {
        // 모든 원소를 다 채운 상태면 count 증가 및 return
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            // 놓을 수 있는 위치일 경우 재귀호출
            if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }

    }

    public static boolean Possibility(int col) {

        for (int i = 0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
            if (arr[col] == arr[i]) {
                return false;
            }

            /*
             * 대각선상에 놓여있는 경우
             * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
             */
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}

//    double beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//    double afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//    double secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
class complete {
     /*
    Baekjoon 15649
    public class Main {
        static int N;
        static int M;
        static StringBuffer sb = new StringBuffer();
        static int[] arr;
        static boolean[] visit;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[M];
            visit = new boolean[N];

            Arrays.fill(visit, false);
            backTracking(arr, visit, 0);

            System.out.println(sb);
        }

        public static void backTracking(int[] arr, boolean[] visit, int depth){
            if(M == depth){
                for(int index : arr){
                    sb.append(index + " ");
                }
                sb.append("\n");

                return;
            }

            for(int i=0; i<N; i++){
                if(!visit[i]){
                    visit[i] = true;
                    arr[depth] = i+1;
                    backTracking(arr, visit, depth+1);

                    visit[i] = false;
                }
            }
        }
    }
    */

    /*
    Baekjoon 15650
    public class Main {

        static int N;
        static int M;
        static StringBuffer sb = new StringBuffer();
        static int[] arr;
        static boolean[] visit;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[M];
            visit = new boolean[N];

            Arrays.fill(visit, false);
            backTracking(0);

            System.out.println(sb);
        }

        public static void backTracking(int depth){
            if(M == depth){
                for(int index : arr){
                    sb.append(index + " ");
                }
                sb.append("\n");

                return;
            }

            for(int i=0; i<N; i++){
                if(!visit[i]){
                    if(depth == 0 || (depth-1>=0 && arr[depth-1] < i+1)){
                        visit[i] = true;
                        arr[depth] = i+1;
                        backTracking(depth+1);
                        visit[i] = false;
                    }
                }
            }
        }
    }
     */

    /*
    Baekjoon 15651
    public class Main {
        static int N;
        static int M;
        static StringBuffer sb = new StringBuffer();
        static int[] arr;
        static boolean[] visit;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[M];
            visit = new boolean[N];

            Arrays.fill(visit, false);
            backTracking(0);

            System.out.println(sb);
        }

        public static void backTracking(int depth){
            if(M == depth){
                for(int index : arr){
                    sb.append(index + " ");
                }
                sb.append("\n");

                return;
            }

            for(int i=0; i<N; i++){
                arr[depth] = i+1;
                backTracking(depth+1);
            }
        }
    }
     */

    /*
    Baekjoon 15652
    public class Main {
        static int N;
        static int M;
        static StringBuffer sb = new StringBuffer();
        static int[] arr;
        static boolean[] visit;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[M];
            visit = new boolean[N];

            Arrays.fill(visit, false);
            backTracking(0);

            System.out.println(sb);
        }

        public static void backTracking(int depth){
            if(M == depth){
                for(int index : arr){
                    sb.append(index + " ");
                }
                sb.append("\n");

                return;
            }

            for(int i=0; i<N; i++){
                if(depth==0 || depth-1>=0 && arr[depth-1]<=i+1){
                    arr[depth] = i+1;
                    backTracking(depth+1);
                }
            }
        }
    }
     */

    /*
    Baekjoon 9663

     */

    /*
    Baekjoon 9663

     */
}