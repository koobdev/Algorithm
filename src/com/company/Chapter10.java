package com.company;

public class Chapter10 {
    /*
    Baekjoon 10872
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    System.out.println(factorial(N));

    static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
    */

    /*
    Baekjoon 10870
    // 0 1 1 2 3 5 8 13 ...
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    System.out.println(fibonacci(N));

    static int fibonacci(int N) {
        if (N == 0)	return 0;
        if (N == 1)	return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
    */

    /*
    Baekjoon 2447
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    String[][] result = new String[N][N];

    for(int i=0; i<result.length; i++){
        for(int j=0; j<result[i].length; j++){
            result[i][j] = " ";
        }
    }

    star(result, 0, 0, N);

    for(int i=0; i<result.length; i++){
        for(int j=0; j<result[i].length; j++){
            bw.write(result[i][j]);
        }
        bw.write("\n");
    }
    bw.flush();
    bw.close();
    br.close();


    static void star(String[][] result, int x, int y, int n){
        if(n==1){
            result[x][y] = "*";
            return;
        }
        for(int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (!(i == 1 && j == 1)) {
                    star(result, x + (j * (n / 3)), y + (i * (n / 3)), n / 3);
                }
            }
        }
    }
    */

    /*
    Baekjoon 11729
    public static int cnt = 0;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 3, 2);
        System.out.println(cnt);
        bw.flush();
        bw.close();
        br.close();
    }

    static void hanoi(int n, int start, int end, int sub) throws IOException {
        if(n == 1){
            cnt++;
            bw.write(start + " " + end + "\n");
        }else {
            hanoi(n-1, start, sub, end);
            hanoi(1, start, end, sub);
            hanoi(n-1, sub, end, start);
        }
    }
    */
}
