package com.company;

public class Chapter4 {
    /*
    Baekjoon 10952
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A != 0 && B != 0){
            bw.write((A+B) + "\n");
        }else {
            break;
        }
    }
    bw.flush();
    bw.close();
    br.close();
    */

    /*
    Baekjoon 10951
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    String str;

    while( (str=br.readLine()) != null ){

        st = new StringTokenizer(str," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sb.append(a+b).append("\n");

    }
    System.out.print(sb);
    */

    /*
    Baekjoon 1110
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int number = Integer.parseInt(br.readLine());
    int next = number;
    int cnt = 0;

    while(true){
        next = ((next%10)*10 + ((next/10)+(next%10))%10);
        cnt++;
        if(number == next) break;
    }

    bw.write(cnt + " ");
    bw.close();
    br.close();
    */
}
