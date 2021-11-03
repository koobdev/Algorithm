package com.company;

public class Chapter5 {
    /*
    Baekjoon 10818
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int arr[] = new int[N];

    // 삽입
    for(int i=0; i<N; i++){

        arr[i] = Integer.parseInt(st.nextToken());
    }

    // 정렬
    Arrays.sort(arr);
    System.out.println(arr[0] + " " + arr[arr.length-1]);
    */

    /*
    Baekjoon 2562
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int arr[] = new int[9];
    int max = 0;
    int index = 0;

    for(int i=0; i<9; i++){
        arr[i] = Integer.parseInt(br.readLine());
        if(arr[i] > max){
            max = arr[i];
            index = i;
        }
    }

    bw.write(max + "\n" + (index+1));
    bw.close();
    br.close();
    */

    /*
    Baekjoon 2577
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
    String strN = Integer.toString(n);
    int resultArr[] = new int[10];

    for(int i=0; i<strN.length(); i++){
        int index = strN.charAt(i) - '0';
        resultArr[index]++;
    }

    for(int i=0; i<resultArr.length; i++){
        System.out.println(resultArr[i]);
    }
    */

    /*
    Baekjoon 3052
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<Integer> resultSet = new HashSet<Integer>();

    for(int i=0; i<10; i++){
        resultSet.add(Integer.parseInt(br.readLine()) % 42);
    }

    System.out.println(resultSet.size());
    */

    /*
    Baekjoon 1546
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    double score[] = new double[N];
    double totalScore = 0;

    for(int i=0; i<N; i++) {
        score[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(score);

    for(int i=0; i<N; i++){
        totalScore += (score[i] / score[N-1] * 100);
    }

    System.out.println(totalScore/N);
    */

    /*
    Baekjoon 8958
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());
    int score = 0;
    int tmpScore = 0;

    for(int i=0; i<T; i++){
        String tmp = br.readLine();
        String result[] = new String[tmp.length()];

        for(int j=0; j<tmp.length(); j++){
            result[j] = Character.toString(tmp.charAt(j));
        }
        for(int j=0; j<result.length; j++){
            if(result[j].equals("O")){
                tmpScore++;
                score += tmpScore;
            }else {
                tmpScore = 0;
            }
        }
        bw.write(score + "\n");
        score = 0;
        tmpScore = 0;
    }
    bw.flush();
    bw.close();
    br.close();
    */

    /*
    Baekjoon 4344
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int C = Integer.parseInt(br.readLine());

    for(int i=0; i<C; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());   // 학생의 수
        int scoreArr[] = new int[N]; // 점수 배열
        int sum = 0; // 점수 합
        int goodMan = 0; // 평균 이상자

        for(int j=0; j<N; j++){
            int tmpScore = Integer.parseInt(st.nextToken());
            scoreArr[j] = tmpScore;
            sum += tmpScore;
        }

        int avg = sum / N; // 점수 평균

        for(int j=0; j<scoreArr.length; j++){
            if(avg < scoreArr[j]) {
                goodMan++;
            }
        }

        double result = goodMan / (double)N * 100;
        System.out.printf("%.3f%%\n", result);
    }
    */
}
