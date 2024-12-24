package A3bfs;

import java.util.*;

public class A302BfsBasic2 {//      모든 node 거리 구하기(최단거리)
    public static void main(String[] args) {

        int[][] edge = {{0,1},{0,2},{1,3},{2,3},{2,4}};


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
        Queue<Integer> myQueue =new LinkedList<>();
        myQueue.add(0);
        visited[0]=true;
        int[] distance =new int[5];
        int count=0;
        while (!myQueue.isEmpty()){
            int temp = myQueue.poll();
            System.out.println(temp);
            for(int target : adjList.get(temp)){

                if(!visited[target]){

                    myQueue.add(target);
                    visited[target]=true;
                    distance[target]=distance[temp]+1;

                }
            }
        }

        System.out.println(Arrays.toString(distance));
    }
}
