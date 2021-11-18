package com.company;

public class Chapter12 {
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
    Baekjoon 1427
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String st = br.readLine();
    Integer[] arr = new Integer[st.length()];

    for(int i=0; i<st.length(); i++){
        arr[i] = st.charAt(i)-'0';
    }

    Arrays.sort(arr, Collections.reverseOrder());

    for(int i : arr){
        System.out.print(i);
    }
    */

    /*
    Baekjoon 11650
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][2];

    for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr[i][0] = Integer.parseInt(st.nextToken());
        arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, new Comparator<int []>(){
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else {
                return o1[0] - o2[0];
            }
        }
    });

    for(int i=0; i<N; i++){
        System.out.print(arr[i][0] + " ");
        System.out.println(arr[i][1]);
    }
    */

    /*
    Baekjoon 11651
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][2];

    for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr[i][0] = Integer.parseInt(st.nextToken());
        arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, new Comparator<int[]>(){
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }else {
                return o1[1] - o2[1];
            }
        }
    });

    for(int i=0; i<N; i++){
        System.out.print(arr[i][0] + " ");
        System.out.println(arr[i][1]);
    }
    */

    /*
    Baekjoon 1181
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] arr = new String[N];

    for(int i=0; i<N; i++){
        String st = br.readLine();
        arr[i] = st;
    }

    Arrays.sort(arr, new Comparator<String>(){
        @Override
        public int compare(String o1, String o2) {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }else {
                return o1.length() - o2.length();
            }
        }
    });

    for(int i=0; i<N; i++){
        if(i+1<arr.length && arr[i].equals(arr[i+1])){
            continue;
        }
        System.out.println(arr[i]);
    }
    */

    /*
    Baekjoon 10814
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[][] arr = new String[N][2];

    for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr[i][0] = st.nextToken();
        arr[i][1] = st.nextToken();
    }

    Arrays.sort(arr, new Comparator<String[]>() {
        @Override
        public int compare(String[] o1, String[] o2) {
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        }
    });

    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i][0] + " " + arr[i][1]);
    }
    */

    /*
    Baekjoon 18870
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] inputArr = new int[N];
    int[] sortArr = new int[N];
    int cnt = 0;
    Map<Integer, Integer> map = new HashMap<>();

    // 2 4 -10 4 -9
    // -10 -9 2 4 4

    // -10 -9 2 4
    //  0  1  2 3
    for(int i=0; i<N; i++){
        int token = Integer.parseInt(st.nextToken());
        inputArr[i] = token;
        sortArr[i] = token;
    }
    Arrays.sort(sortArr);

    for(int i=0; i<N; i++){
        if(!map.containsKey(sortArr[i])){
            map.put(sortArr[i], cnt++);
        }
    }
    for(int i=0; i<N; i++){
        sb.append(map.get(inputArr[i]) + " ");
    }
    System.out.println(sb);
    */
}
