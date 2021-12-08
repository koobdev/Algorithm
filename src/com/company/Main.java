package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[] isMatched;
    static boolean[] isVisited;
    static int[] startTeam;
    static int[] linkTeam;
    static int[] startTeamPoint;
    static int[] linkTeamPoint;
    static int startTeamSum;
    static int linkTeamSum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        isMatched = new boolean[N];
        isVisited = new boolean[N/2];
        startTeam = new int[N/2];
        linkTeam = new int[N/2];
        startTeamPoint = new int[2];
        linkTeamPoint = new int[2];

        Arrays.fill(isMatched, false);

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
        }

        matchTeam(0);
    }

    public static void matchTeam(int depth){
        if(depth == N/2){
//            for(int i=0; i<isMatched.length; i++){
//                System.out.print(isMatched[i] + " ");
//            }
//            System.out.println("\n");
//
//            for(int i=0; i<depth; i++){
//                for(int j=0; j<6; j++){
//
//                }
//            }
//            System.out.println(startTeam[0] + " " + linkTeam[1]);

            ability(0);
            System.out.println("start : " + startTeamSum + "link : " + linkTeamSum);
            return;
        }

        for(int i=0; i<N; i++){
            if(!isMatched[i]){
                if(depth == 0 || (depth-1>=0 && startTeam[depth-1]<i+1)){
                    isMatched[i] = true;
                    startTeam[depth] = i+1;
                    matchTeam(depth+1);
                    isMatched[i] = false;
                }
            }
        }
    }

    public static void ability(int depth){
        if(depth == 2){
            startTeamSum += arr[startTeamPoint[1]][startTeamPoint[0]];
            linkTeamSum += arr[linkTeamPoint[1]][linkTeamPoint[0]];
        }

        for(int i=0; i<N/2; i++){
            startTeamPoint[depth] = startTeam[i];
            linkTeamPoint[depth] = linkTeam[i];
            ability(depth+1);
        }
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
    public class Main {
        static int N;
        static int[] arr;
        static int cnt=0;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            arr = new int[N];

            nQueen(0);
            System.out.println(cnt);
        }

        // column : 행, i : 열
        public static void nQueen(int column){
            if(column == N) {
                cnt++;
                return;
            }
            for(int i=0; i<N; i++){
                arr[column] = i;
                if(isPossible(column)){
                    nQueen(column+1);
                }
            }
        }

        // 퀸이 움직일 수 있는 위치에 다른 퀸이 있는지 판단
        public static boolean isPossible(int column){
            for(int i=0; i<column; i++){
                if(arr[i] == arr[column]){
                    // 같은 열에 있을 때
                    return false;
                }else if(Math.abs(i-column) == Math.abs(arr[i]-arr[column])){
                    // 대각선에 있을 때
                    return false;
                }
            }
            return true;
        }
    }
     */

    /*
    Baekjoon 2580 - 아직 풀이중.....
    public class Main {
        static int[][] matrix = new int[9][9];

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i=0; i<9; i++){
                String line = br.readLine();
                for(int j=0; j<9; j++){
                    StringTokenizer st = new StringTokenizer(line, " ");
                    matrix[j][i] = Integer.parseInt(st.nextToken());
                }
            }

            sudoku(0, 0);
        }

        public static void sudoku(int column, int row){
            System.out.println(row);
            if(row == 9) {
                for(int i=0; i<9; i++){
                    for(int j=0; j<9; j++){
                        System.out.println(matrix[j][i] + " ");
                    }
                    System.out.println("\n");
                }
                return;
            }

            if(matrix[column][row] == 0){
                for(int i=1; i<=9; i++){
                    if(isCorrect(column, row, i)){
                        matrix[column][row] = i;
                        sudoku(column, row+1);
                    }
                }
            }
        }

        public static boolean isCorrect(int column, int row, int value){
            // 1. 가로 확인
            for(int i=0; i<9; i++){
                if(matrix[i][row] == value){
                    return false;
                }
            }

            // 2. 세로 확인
            for(int i=0; i<9; i++){
                if(matrix[column][i] == value){
                    return false;
                }
            }

            // 3. 3*3 확인
            for(int i=0; i<(row/3)*3+3; i++){
                for(int j=0; j<(row/3)*3+3; j++){
                    if(matrix[j][i] == value){
                        return false;
                    }
                }
            }

            return true;
        }
    }
     */

    /*
    Baekjoon 14888
    public class Main {
        static int N;
        static int[] number;
        static int[] operator;
        static List<Integer> list = new ArrayList<>();

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            number = new int[N];
            operator = new int[4];
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            for(int i=0; i<N; i++){
                number[i] = Integer.parseInt(st1.nextToken());
            }
            for(int i=0; i<4; i++){
                operator[i] = Integer.parseInt(st2.nextToken());
            }

            makeCalc(1, number[0]);
            Collections.sort(list);
            System.out.println(list.get(list.size()-1) + "\n" + list.get(0));
        }

        public static void makeCalc(int depth, int num){
            if(depth == N){
                list.add(num);
                return;
            }

            for(int i=0; i<4; i++){
                if(operator[i] != 0){
                    operator[i]--;
                    int calc = calc(depth, num, i);
                    makeCalc(depth+1, calc);
                    operator[i]++;
                }
            }
        }

        public static int calc(int depth, int num, int index){
            int result = 0;
            switch (index){
                case 0:
                    result = num + number[depth];
                    break;
                case 1:
                    result = num - number[depth];
                    break;
                case 2:
                    result = num * number[depth];
                    break;
                case 3:
                    result = num / number[depth];
                    break;
            }
            return result;
        }
    }
     */

    /*
    Baekjoon 14889

     */
}