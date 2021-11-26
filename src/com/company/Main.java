package com.company;

import java.util.*;
import java.io.*;

class Dot{
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Main {

    static int N;
    static int M;
    static int H;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());
        H = Integer.parseInt(st1.nextToken());

        int[][] arr = new int[M*H][N];
        boolean[][] visit = new boolean[M*H][N];

        for(int i=0; i<M*H; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        bfs(arr, visit);

        for(int i=0; i<M*H; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("\n");
        }

        if (isCom(arr)) {
            System.out.println(max - 1);
        } else {
            System.out.println("-1");
        }

    }

    public static void bfs(int[][] arr, boolean[][] visit){
        Queue<Dot> queue = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0, M, M*(-1)};
        int[] dy = {0, 1, 0, -1, 0, 0};

        for(int i=0; i<M*H; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 1){
                    queue.add(new Dot(i, j));
                    visit[i][j] = true;
                }
            }
        }

        while(!queue.isEmpty()){
            Dot dot = queue.poll();
            for(int i=0; i<6; i++){
                int x = dot.getX()+dx[i];
                int y = dot.getY()+dy[i];

                if(dot.getX()<M && x>=M) continue;
                if(x>=0 && x<M*H && y>=0 && y<N) {
                    if(arr[x][y] == 0 && !visit[x][y]){
                        visit[x][y] = true;
                        arr[x][y] = arr[dot.getX()][dot.getY()] + 1;
                        queue.add(new Dot(x, y));
                    }
                }
            }
        }
    }

    public static boolean isCom(int[][] arr){
        for(int i=0; i<M*H; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 0) return false;
                else if(arr[i][j] > max) max = arr[i][j];
            }
        }
        return true;
    }
}

//    double beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//    double afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//    double secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
class complete {
     /*
    Baekjoon 10814

    */

    /*
    Baekjoon 1260

    // 인접 행렬
    public class Main {
        static StringBuilder sb = new StringBuilder();
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            int[][] matrix = new int[N+1][N+1];
            boolean[] visit = new boolean[N+1];

            for(int i=0; i<M; i++){
                StringTokenizer mst = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(mst.nextToken());
                int y = Integer.parseInt(mst.nextToken());

                matrix[x][y] = 1;
                matrix[y][x] = 1; // 대칭으로 만들어 줌.
            }

            dfs(matrix, visit, V);
            Arrays.fill(visit, false);
            sb.append("\n");
            bfs(matrix, visit, V);

            System.out.println(sb);
        }

        public static void dfs(int[][] matrix, boolean[] visit, int V){
            visit[V] = true;
            sb.append(V + " ");

            for(int i=1; i<visit.length; i++){
                if(matrix[V][i] == 1 && !visit[i]){
                    dfs(matrix, visit, i);
                }
            }
        }

        public static void bfs(int[][] matrix, boolean[] visit, int V){
            Queue<Integer> queue = new LinkedList<>();
            queue.add(V);
            visit[V] = true;

            while(!queue.isEmpty()){
                int node = queue.poll();
                sb.append(node + " ");
                for(int i=1; i<visit.length; i++){
                    if(matrix[node][i] == 1 && !visit[i]){
                        queue.add(i);
                        visit[i] = true;
                    }
                }
            }
        }
    }

    // 인접 리스트
    public class Main {
        static StringBuilder sb = new StringBuilder();
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            List<Integer>[] list = new List[N+1];
            boolean[] visit = new boolean[N+1];

            for(int i=0; i< list.length; i++){
                list[i] = new ArrayList<>();
            }

            for(int i=0; i<M; i++){
                StringTokenizer nodeSt = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(nodeSt.nextToken());
                int y = Integer.parseInt(nodeSt.nextToken());

                list[x].add(y);
                list[y].add(x);
            }

            for(int i=0; i<list.length; i++){
                Collections.sort(list[i]);
            }

            dfs(list, visit, V);
            Arrays.fill(visit, false);
            sb.append("\n");
            bfs(list, visit, V);

            System.out.println(sb);
        }

        public static void dfs(List<Integer>[] lists, boolean[] visit, int V){
            visit[V] = true;
            sb.append(V + " ");

            for(int i=0; i<lists[V].size(); i++){
                if(!visit[lists[V].get(i)]){
                    dfs(lists, visit, lists[V].get(i));
                }
            }
        }

        public static void bfs(List<Integer>[] lists, boolean[] visit, int V){
            Queue<Integer> queue = new LinkedList<>();
            queue.add(V);
            visit[V] = true;

            while(!queue.isEmpty()){
                int node = queue.poll();
                sb.append(node + " ");

                for(int i=0; i<lists[node].size(); i++){
                    if(!visit[lists[node].get(i)]){
                        queue.add(lists[node].get(i));
                        visit[lists[node].get(i)] = true;
                    }
                }
            }
        }
    }
    */

    /*
    Baekjoon 2606
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<Integer>[] list = new ArrayList[N+1];
        boolean[] visit = new boolean[N+1];
        for(int i=0; i< list.length; i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }
        for(int i=0; i<list.length; i++){
            Collections.sort(list[i]);
        }
        dfs(list, visit, 1);
        System.out.println(cnt);
    }
    public static void dfs(List<Integer>[] list, boolean[] visit, int start){
        visit[start] = true;
        for(int i=0; i<list[start].size(); i++){
            if(!visit[list[start].get(i)]){
                cnt++;
                dfs(list, visit, list[start].get(i));
            }
        }
    }
    */

    /*
    Baekjoon 2667
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N+1][N+1];
        boolean[][] visit = new boolean[N+1][N+1];

        for(int i=1; i<=N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j+1] = line.charAt(j)-'0';
            }
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(arr[i][j] == 1 && !visit[i][j]){
                    dfs(arr, visit, i, j, N);
                    cnt++;
                }
            }
        }

        int[] result = new int[cnt-1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(arr[i][j] != 0){
                    result[arr[i][j]-1]++;
                }
            }
        }
        Arrays.sort(result);

        sb.append(cnt-1 + "\n");
        for(int i=0; i<result.length; i++){
            sb.append(result[i] + "\n");
        }
        System.out.println(sb);
    }

    static void dfs(int[][] arr, boolean[][] visit, int i, int j, int N){
        visit[i][j] = true;
        arr[i][j] = cnt;

        for(int k=0; k<4; k++){
            int x = i+dx[k];
            int y = j+dy[k];
            if(x >= 0 && x <= N && y >=0 && y <= N){
                if(arr[x][y] == 1 && !visit[x][y]){
                    dfs(arr, visit, x, y, N);
                }
            }
        }
    }
    */


    /*
    Baekjoon 1012
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st1.nextToken());
            int N = Integer.parseInt(st1.nextToken());
            int K = Integer.parseInt(st1.nextToken());
            int[][] arr = new int[N][M];
            boolean[][] visit = new boolean[N][M];
            int cnt = 0;

            for(int j=0; j<K; j++){
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st2.nextToken());
                int y = Integer.parseInt(st2.nextToken());
                arr[y][x]++;
            }

            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(arr[j][k] == 1 && !visit[j][k]){
                        search(arr, visit, j, k, M, N);
                        cnt++;
                    }
                }
            }

            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }
    static void search(int[][] arr, boolean[][] visit, int i, int j, int M, int N){
        visit[i][j] = true;
        for(int idx=0; idx<4; idx++){
            int x = i+dx[idx];
            int y = j+dy[idx];
            if(x>=0 && x<N && y>=0 && y<M){
                if(arr[x][y] == 1 && !visit[x][y]){
                    search(arr, visit, x, y, M, N);
                }
            }
        }
    }
    */

    /*
    Baekjoon 2178
        class Dot{
        private int x;
        private int y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] arr = new int[M][N];
            boolean[][] visit = new boolean[M][N];

            for(int i=0; i<N; i++){
                String line = br.readLine();
                for(int j=0; j<line.length(); j++){
                    arr[j][i] = line.charAt(j)-'0';
                }
            }
            bfs(arr, visit, N, M);
            System.out.println(arr[M-1][N-1]);
        }

        public static void bfs(int[][] arr, boolean[][] visit, int N, int M){
            Queue<Dot> queue = new LinkedList<>();
            int a =0 ,b = 0;
            visit[a][b] = true;
            queue.add(new Dot(a, b));

            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            while(!queue.isEmpty()){
                Dot dot = queue.poll();
                for(int i=0; i<4; i++){
                    int x = dot.getX()+dx[i];
                    int y = dot.getY()+dy[i];
                    if(x >= 0 && x<M && y >=0 && y<N){
                        if(arr[x][y] == 1 && !visit[x][y]){
                            visit[x][y] = true;
                            queue.add(new Dot(x, y));
                            arr[x][y] = arr[dot.getX()][dot.getY()] + 1;
                        }
                    }
                }
            }
        }
    }
    */

    /*
    Baekjoon 7576
        class Dot{
        private int x;
        private int y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public class Main {

        static int N;
        static int M;
        static int max = 0;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st1.nextToken());
            M = Integer.parseInt(st1.nextToken());
            int[][] arr = new int[M][N];
            boolean[][] visit = new boolean[M][N];

            for(int i=0; i<M; i++){
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                for(int j=0; j<N; j++){
                    arr[i][j] = Integer.parseInt(st2.nextToken());
                }
            }

            bfs(arr, visit);

            if (isCom(arr)) {
                System.out.println(max - 1);
            } else {
                System.out.println("-1");
            }
        }

        public static void bfs(int[][] arr, boolean[][] visit){
            Queue<Dot> queue = new LinkedList<>();
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(arr[i][j] == 1){
                        queue.add(new Dot(i, j));
                        visit[i][j] = true;
                    }
                }
            }

            while(!queue.isEmpty()){
                Dot dot = queue.poll();
                for(int i=0; i<4; i++){
                    int x = dot.getX()+dx[i];
                    int y = dot.getY()+dy[i];

                    if(x>=0 && x<M && y>=0 && y<N){
                        if(arr[x][y] == 0 && !visit[x][y]){
                            visit[x][y] = true;
                            arr[x][y] = arr[dot.getX()][dot.getY()] + 1;
                            queue.add(new Dot(x, y));
                        }
                    }
                }
            }
        }

        public static boolean isCom(int[][] arr){
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(arr[i][j] == 0) return false;
                    else if(arr[i][j] > max) max = arr[i][j];
                }
            }
            return true;
        }
    }
     */

    /*
    Baekjoon 7576

     */
}