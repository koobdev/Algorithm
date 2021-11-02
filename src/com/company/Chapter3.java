package com.company;

public class Chapter3 {
    /*
    Baekjoon 2739
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int i=1; i<=9; i++){
        System.out.println(n + " * " + i + " = " + (n*i));
    }
    */

    /*
    Baekjoon 10950
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();

    for(int i=0; i<T; i++){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x+y);
    }
    */

    /*
    Baekjoon 8393
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    if(1<=n && n<=10000){
        int m=0;
        for(int i=1; i<=n; i++){
            m += i;
        }
        System.out.println(m);
    }
    */

    /*
    Baekjoon 15552
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());

    if(T<=1000000){
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
    }
    br.close();
    bw.flush();
    bw.close();
    */

    /*
    Baekjoon 2741
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    if(N<=100000){
        for(int i=1; i<=N; i++){
            bw.write(i + "\n");
        }
    }
    br.close();
    bw.flush();
    bw.close();
    */

    /*
    Baekjoon 2742
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    if(N<=100000){
        for(int i=N; i>=1; i--){
            bw.write(i + "\n");
        }
    }
    br.close();
    bw.flush();
    bw.close();
    */

    /*
    Baekjoon 11021
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());

    for(int i=1; i<=T; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
    }
    bw.flush();
    bw.close();
    br.close();
    */

    /*
    Baekjoon 11022
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());

    for(int i=1; i<=T; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A+B) + "\n");
    }
    bw.flush();
    bw.close();
    br.close();
    */

    /*
    Baekjoon 2438
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for(int i=0; i<N; i++){
        for(int j=0; j<i+1; j++){
            System.out.print("*");
        }System.out.print("\n");
    }
    */

    /*
    Baekjoon 2439
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for(int i=0; i<N; i++){
        for(int j=N; j>i+1; j--){
            System.out.print(" ");
        }
        for(int j=0; j<i+1; j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    */

    /*
    Baekjoon 10871
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st1.nextToken());
    int X = Integer.parseInt(st1.nextToken());

    for(int i=0; i<N; i++){
        int com = Integer.parseInt(st2.nextToken());
        if(com < X){
            bw.write(com + " ");
        }
    }
    bw.flush();
    bw.close();
    br.close();
    */
}
