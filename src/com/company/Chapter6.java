package com.company;

public class Chapter6 {
    /*
    Baekjoon 15596
    public class Test {
        long sum(int[] a) {
            long ans = 0;
            for(int i=0; i<a.length; i++){
                ans += a[i];
            }
            return ans;
        }
    }
    */

    /*
    Baekjoon 4673
    public static void main(String[] args) {
        int[] resultArr = new int[10001];

        for(int i=1; i<=10000; i++) {
            if(self(i) <= 10000){
                resultArr[self(i)] += 1;
            }
        }

        for(int i=1; i<=10000; i++){
            if(resultArr[i] < 1){
                System.out.println(i);
            }
        }
    }

    public static int self(int n){
        int result = 0;
        result += n;

        while(true){
            int x = n%10;
            result += x;
            n /= 10;
            if(n < 10){
                result += n;
                break;
            }
        }
        return result;
    }
    */

    /*
    Baekjoon 1065
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int cnt = 0;

    if(N > 99){
        cnt += 99;
        for(int i=100; i<=N; i++){
            if(i==1000) break;

            int one = i%10;
            int ten = (i/10)%10;
            int hun = (i/100)%10;

            if(ten-hun == one-ten){
                cnt++;
            }
        }
    }else {
        cnt += N;
    }
    System.out.println(cnt);
    */
}
