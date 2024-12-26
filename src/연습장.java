import java.util.*;

public class 연습장 {
    static List<List<Integer>> adjList;
    static List<List<Integer>> answer;
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3,7}, {4,8}, {4,9}, {5,10}};
        adjList = new ArrayList<>();
        for(int i=0; i<11;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a: arr){
            adjList.get(a[0]).add(a[1]);
        }

    }
    static void dfs(int start, List<Integer> temp){
        temp.add(start);
        if(adjList.get(start).isEmpty()){
            answer.add(new ArrayList<>(temp));

        }
    }



}
