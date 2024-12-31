import java.io.*;
import java.util.LinkedList;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[computer+1]; //방문 배열 초기화
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer>[] A = new ArrayList[computer+1]; //ArrayList 타입 배열 선언
        ArrayList<Integer> procedure = new ArrayList<>(); //탐색 순서 출력을 위한 리스트

        //ArrayList 형 배열 A 초기화
        for(int i=1;i<=A.length-1;i++) {
            A[i] = new ArrayList<>();//배열의 각 요소마다 ArrayList를 가진다.
        }
        //위의 예제 인접 리스트 초기화
        int line = Integer.parseInt(br.readLine());
        for(int i=0; i<line; i++) {
            String[] connection = br.readLine().split(" ");
            A[Integer.parseInt(connection[0])].add(Integer.parseInt(connection[1]));
            A[Integer.parseInt(connection[1])].add(Integer.parseInt(connection[0]));

        }
        System.out.println(Arrays.toString(A));

        DFS(1,stack, procedure,visited, A);


        System.out.println(procedure.size()-1); //[1, 2, 3, 5, 6, 4]
    }
    private static void DFS(int start,Stack<Integer> stack, ArrayList<Integer> procedure,boolean[] visited, ArrayList<Integer>[] A) {
        stack.add(start);
        visited[1]=true;
        while (!stack.isEmpty()){
            int now = stack.pop();
            procedure.add(now);
            for(int i=0; i<A[now].size();i++){
                int node = A[now].get(i);
                if(!procedure.contains(node)&&visited[node]==false){
                    stack.add(node);
                    visited[node]=true;
                }

            }


        }

    }
    private static void BFS(int start,Queue<Integer> queue, ArrayList<Integer> procedure,boolean[] visited, ArrayList<Integer>[] A){
        queue.offer(start);

        while(!queue.isEmpty()){
            int now = queue.poll();
            // poll() 할때, 탐색순서 리스트에 넣어주고,방문배열을 true로 바꿔준다.
            procedure.add(now);
            visited[now] = true;

            // 꺼낸 노드의 인접노드를 전부 확인한다.
            for(int i=0;i<A[now].size();i++){
                int node = A[now].get(i);

                //인접노드가 방문한적 없는 노드면 queue에 넣어준다.
                if(!visited[node]&& !queue.contains(node)){
                    queue.offer(node);
                }
            }
            System.out.println(procedure);
        }//while문
    }//DFS 메소드



}
