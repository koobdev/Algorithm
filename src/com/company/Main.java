package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        pivotSort(arr, 0, arr.length-1);

        for(int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }

    private static void pivotSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int pivot = partition(arr, low, high);
        System.out.println("pivot : " + pivot);
        pivotSort(arr, low, pivot-1);
        pivotSort(arr, pivot+1, high);
    }

    // 1 4 2 0 3
    // 1 0 2 4 3
    // 0 1 2 4 2 -> return 1 (pivot);
    private static int partition(int[] arr, int left, int right){
        int low = left;
        int high = right;
        int pivot = arr[left];

        while(low < high){

            // high
            while(arr[high] > pivot && low < high){
                high--;
            }
            // low
            while(arr[low] <= pivot && low < high){
                low++;
            }

            swap(arr, low, high);
        }
        swap(arr, left, low);

        return low;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

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
    Baekjoon 2798

    */
}