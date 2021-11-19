package com.company;

public class Chapter24 {
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
}
