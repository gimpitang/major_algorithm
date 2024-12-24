import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int [] intArr = new int[input.length];
        for(int i =0; i<input.length;i++){
            intArr[i]=Integer.parseInt(input[i]);
        }
//        System.out.println(Arrays.toString(intArr));

        List<List<Integer>> myList = new ArrayList<>();
        for (int i =0; i<intArr[0]+1; i++){
            myList.add(new ArrayList<>());
        }
        for(int i=0; i<intArr[1];i++){
            String[] line = br.readLine().split(" ");
            myList.get(Integer.parseInt(line[0])).add(Integer.parseInt(line[1]));
            myList.get(Integer.parseInt(line[1])).add(Integer.parseInt(line[0]));
        }
        for(List<Integer>a: myList){
            a.sort(Comparator.naturalOrder());
        }
        boolean [] visited1 = new boolean[intArr[0]+1];
        boolean [] visited2 = new boolean[intArr[0]+1];

        DFS(myList,intArr[2],visited1);
        Queue<Integer> myQueue =new LinkedList<>();
        BFS(myList,intArr[2],visited2,myQueue);



    }
    static void DFS(List<List<Integer>> myList, int start,boolean[] visited){
        StringBuilder sb = new StringBuilder();
        sb.append(start).append(" ");
//        System.out.println(start);
        visited[start]=true;

        for (int a : myList.get(start)) {
            if(visited[a]==false) {
                DFS(myList, a, visited);
                sb.append(myList.get(start)).append(" ");
            }
        }
        System.out.println(sb.toString().trim());


    }
    static void BFS(List<List<Integer>> myList, int start,boolean[] visited,Queue<Integer> myQueue){
            StringBuilder sb = new StringBuilder();
//        System.out.println(start);
        myQueue.offer(start);
        sb.append(start).append(" ");
        visited[start]=true;

        while (!myQueue.isEmpty()){
            int temp = myQueue.poll();

//            System.out.println(temp);
            for(int target : myList.get(temp)){
                if(!visited[target]){
                    myQueue.add(target);
                    sb.append(target).append(" ");
                    //      Queue에 add하는 시점에 boolean 값 세팅
                    visited[target]=true;
                }

            }
        }
            System.out.println(sb.toString().trim());


    }
}
