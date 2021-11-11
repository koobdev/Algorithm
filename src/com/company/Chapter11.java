package com.company;

public class Chapter11 {
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
