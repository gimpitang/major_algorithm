package A3bfs;

import java.util.*;

public class A304가장먼노드 {
    public static void main(String[] args) {

        int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
        //     0에서 출발하여 4번node까지 도달하는 최단거리 구하기
        int targetNode =4;
        int n = 6;

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i =0; i<n+1;i++){
            adjList.add(new ArrayList<>());
        }

        for (int[] a :edge){
            adjList.get((a[0])).add(a[1]);
            adjList.get((a[1])).add(a[0]);
        }

        for(List<Integer>a: adjList){
            a.sort(Comparator.naturalOrder());
        }
        System.out.println(adjList);
        boolean[] visited = new boolean[n+1];
        Queue<Integer> myQueue =new LinkedList<>();
        myQueue.add(1);
        visited[1]=true;
        int[] distance =new int[n+1];
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
        Arrays.sort(distance);
        int count=0;
        for(int i=0; i<distance.length;i++){
            if(distance[i]==distance[distance.length-1]){
                count++;
            }
        }
        System.out.println(count);

    }
}
