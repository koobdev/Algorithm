package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

    }
}
//
//    double beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//
//    double afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//    double secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
class complete {
    /*
    Baekjoon 2798

    */

    /*
    Baekjoon 2750
    // O(n²) : 선택정렬
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];

    for(int i=0; i<N; i++){
        arr[i] = Integer.parseInt(br.readLine());
    }

    for(int i=0; i<N; i++){
        int min = i;
        for(int j=i+1; j<N; j++){
            if(arr[i] > arr[j]){
                min = j;
            }
        }
        int tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
    }

    for(int i=0; i<N; i++){
        System.out.println(arr[i]);
    }
    */


    // O(n²) : 삽입정렬
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];

    for(int i=0; i<N; i++){
        arr[i] = Integer.parseInt(br.readLine());
    }

    for(int i=1; i<N; i++){
        int target = arr[i];
        int j = i-1;
        while(j>=0 && target<arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = target;
    }

    for(int i=0; i<N; i++){
        System.out.println(arr[i]);
    }
    */

    // O(n²) : 버블정렬
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];

    for(int i=0; i<N; i++){
        arr[i] = Integer.parseInt(br.readLine());
    }

    for(int i=1; i<N; i++){
        for(int j=0; j<N-i; j++){
            if(arr[j] > arr[j+1]){
                int tmp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    for(int i=0; i<N; i++){
        System.out.println(arr[i]);
    }
    */


    /*
    Baekjoon 2751

    // 퀵정렬 구현
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }

            quickSort(arr, 0, arr.length-1);

            for(int i=0; i<N; i++){
                System.out.println(arr[i]);
            }
        }

        // 1 4 2 0 3
        private static void quickSort(int[] arr, int start, int end){
            if(start>end) return;
            int left = start+1;
            int right = end;
            int pivot = start;

            while(left <= right){
                // left
                while(left<=end && arr[left]<arr[pivot]){
                    left++;
                }
                // right
                while(right>start && arr[right]>arr[pivot]){
                    right--;
                }

                if(left > right){
                    int tmp = arr[right];
                    arr[right] = arr[pivot];
                    arr[pivot] = tmp;
                }else {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                }
            }

            quickSort(arr, start, right-1);
            quickSort(arr, right+1, end);
        }
    }
    */


    /*
    Baekjoon 2751
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> list = new ArrayList<>();

    for(int i=0; i<N; i++){
        list.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(list);
    for(int i=0; i<N; i++){
        sb.append(list.get(i)).append('\n');
    }

    System.out.println(sb);
    */

    /*
    Baekjoon 10989
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[10001];

    for(int i=0; i<N; i++){
        arr[Integer.parseInt(br.readLine())]++;
    }
    for(int i=0; i<arr.length; i++){
        while(arr[i]>0){
            sb.append(i).append('\n');
            arr[i]--;
        }
    }
    System.out.println(sb);
    */

    /*
    Baekjoon 2108
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    double sum = 0;
    int max = 0;
    int index = 0;
    int[] indexArr = new int[8001];
    int[] resultArr = new int[N];
    ArrayList<Integer> most = new ArrayList<>();

    for(int i=0; i<N; i++){
        int num = Integer.parseInt(br.readLine());
        sum += num;
        indexArr[num + 4000]++ ;
    }

    for(int i=0; i<indexArr.length; i++){
        int cnt = indexArr[i];
        while(cnt > 0 && index < N){
            resultArr[index] = i-4000;
            cnt--;
            index++;
        }
        if(indexArr[i] > max){
            most.clear();
            max = indexArr[i];
            most.add(i-4000);
        }else if(indexArr[i] == max){
            most.add(i-4000);
        }
    }

    sb.append(Math.round(sum/N)).append('\n');
    sb.append(resultArr[(N/2)]).append('\n');
    if(most.size() > 1){
        sb.append(most.get(1)).append('\n');
    }else {
        sb.append(most.get(0)).append('\n');
    }
    sb.append(resultArr[N-1] - resultArr[0]).append('\n');

    System.out.println(sb);
    */

    /*
    Baekjoon 2798

    */

    /*
    Baekjoon 2798

    */

    /*
    Baekjoon 2798

    */
}