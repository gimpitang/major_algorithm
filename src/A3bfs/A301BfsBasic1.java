package A3bfs;

import java.util.*;

public class A301BfsBasic1 {
    public static void main(String[] args) {
        //      방문할 수 있는 정점이 여러개인 경우, 정점번호가 작은 것을 먼저 방문.
        //      bfs알고리즘 형식의 방문순서를 출력. 출발은 0부터.
        int[][] edge = {{0,1},{0,2},{1,3},{2,3},{2,4}};
        //      dfs로 방문 시 0->1->3->2->4 순서로 방문함. 0에서 시작 기준
        //      bfs로 방문 시 0->1->2->3->4 순서로 방문함. 0에서 시작 기준

        //      인접리스트로 담기. 양방향
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i =0; i<5;i++){
            adjList.add(new ArrayList<>());
        }

        for (int[] a :edge){
            adjList.get((a[0])).add(a[1]);
            adjList.get((a[1])).add(a[0]);
        }
        for(List<Integer>a: adjList){
            a.sort(Comparator.naturalOrder());
        }

        boolean[] visited = new boolean[5];
        //      bfs알고리즘을 구현하기 위한 Queue 생성
        Queue<Integer> myQueue =new LinkedList<>();
        myQueue.add(0);
        visited[0]=true;
        //      Queue가 비워질 때까지, 방문 계속.
        //      queue가 비워진다는 것은 더이상 갈 곳이 없을 때를 의미. 이때 코드를 종료.
        while (!myQueue.isEmpty()){
            int temp = myQueue.poll();
            System.out.println(temp);
            for(int target : adjList.get(temp)){
                if(!visited[target]){
                    myQueue.add(target);
                    //      Queue에 add하는 시점에 boolean 값 세팅
                    visited[target]=true;
                }

            }
        }



    }


}
