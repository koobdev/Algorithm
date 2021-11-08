package com.company;

public class Chapter7 {
    /*
    Baekjoon 11654
    int a = System.in.read();
    System.out.println(a);
     */

    /*
    Baekjoon 11720
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String st = br.readLine();
    int result = 0;

    for(int i=0; i<N; i++){
        result += st.charAt(i)-'0';
    }
    System.out.println(result);
     */

    /*
    Baekjoon 2675
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());

    for(int i=0; i<T; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        String S = st.nextToken();
        for (int j=0; j<S.length(); j++){
            for(int k=0; k<R; k++){
                bw.write(S.charAt(j));
            }
        }
        bw.write("\n");
    }
    bw.flush();
    bw.close();
    br.close();
     */

    /*
    Baekjoon 1157
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    int result[] = new int[26];
    int max = 0;
    char resultChar = ' ';

    for(int i=0; i<word.length(); i++){
        int a = word.charAt(i);
        if(a > 96){
            a -= 32;
        }
        result[(a-65)]++;
    }

    for(int i=0; i<result.length; i++){
        if(max < result[i]){
            max = result[i];
            resultChar = (char)(i+65);
        }else if(max == result[i]){
            resultChar = '?';
        }
    }

    System.out.println(resultChar);
    */

    /*
    Baekjoon 1152
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    System.out.println(st.countTokens());
    */

    /*
    Baekjoon 2908
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int newA = Integer.parseInt(Integer.toString(A % 10) + Integer.toString((A / 10) % 10) + Integer.toString(A / 100));
    int newB = Integer.parseInt(Integer.toString(B % 10) + Integer.toString((B / 10) % 10) + Integer.toString(B / 100));

    if (newA > newB) System.out.println(newA);
    else System.out.println(newB);
    */

    /*
    Baekjoon 5622
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    int time = 0;
    for(int i=0; i<word.length(); i++){
    int s = word.charAt(i);
    if(0 <= s-65 && s-65 <= 2){
        time += 3;
    }else if(3 <= s-65 && s-65 <= 5){
        time += 4;
    }else if(6 <= s-65 && s-65 <= 8){
        time += 5;
    }else if(9 <= s-65 && s-65 <= 11){
        time += 6;
    }else if(12 <= s-65 && s-65 <= 14){
        time += 7;
    }else if(15 <= s-65 && s-65 <= 18){
        time += 8;
    }else if(19 <= s-65 && s-65 <= 21){
        time += 9;
    }else if(22 <= s-65 && s-65 <= 25){
        time += 10;
    }

    System.out.println(time);
    */

    /*
    Baekjoon 2941
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    int index = 0;
    int cnt = 0;

    while(word.length() != index){
        if(word.length() != index+1){
            if(word.charAt(index) == 'c'){
                if(word.charAt(index+1) == '=' || word.charAt(index+1) == '-'){
                    index++;
                }
            }else if(word.charAt(index) == 'd'){
                if(word.charAt(index+1) == 'z'){
                    if(word.length() != index+2){
                        if(word.charAt(index+2) == '='){
                            index += 2;
                        }
                    }
                }else if(word.charAt(index+1) == '-'){
                    index++;
                }
            }else if(word.charAt(index) == 'l'){
                if(word.charAt(index+1) == 'j'){
                    index++;
                }
            }else if(word.charAt(index) == 'n'){
                if(word.charAt(index+1) == 'j'){
                    index++;
                }
            }else if(word.charAt(index) == 's'){
                if(word.charAt(index+1) == '='){
                    index++;
                }
            }else if(word.charAt(index) == 'z'){
                if(word.charAt(index+1) == '='){
                    index++;
                }
            }
        }
        cnt++;
        index++;
    }
    System.out.println(cnt);
    */

    /*
    Baekjoon 1316
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int cnt = N;

    // happy
    for(int i=0; i<N; i++){
        String word = br.readLine();
        int[] alpha = new int[26];
        for(int j=0; j<word.length(); j++) {
            int target = word.charAt(j);
            if (j+1 != word.length() && target == word.charAt(j+1)) {
                continue;
            } else {
                alpha[target-97]++;
            }
        }

        for(int j=0; j<alpha.length; j++){
            if(alpha[j] > 1){
                cnt--;
                break;
            }
        }
    }
    System.out.println(cnt);
    */
}
