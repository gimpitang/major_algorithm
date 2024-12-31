package 문제를풉시다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class 연결_요소의_개수11724_백준 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] inputs = br.readLine().split(" ");
        int node = Integer.parseInt(inputs[0]);
        int liens = Integer.parseInt(inputs[1]);

        List<List<Integer>> myList = new ArrayList<>();
        for(int i=0; i<node+1;i++){
            myList.add(new ArrayList<>());
        }

        //      방문처리를 위한 도구...습관성이지만 이번엔 필요할 듯 하여 했습니다.
        boolean[] visited = new boolean[node+1];


        //      값 넣어주는 행동.
        for (int i=0; i<liens; i++){
            String [] gansun = (br.readLine().split(" "));
            int [] intGansun = new int[gansun.length];
            for (int j=0; j<gansun.length; j++){
                intGansun[j] = Integer.parseInt(gansun[j]);
            }
            //      양방향 간선을 표기함. 그런데 이거 단방향으로 해야만 하는 경우가 있나요...??
            myList.get(intGansun[0]).add(intGansun[1]);
            myList.get(intGansun[1]).add(intGansun[0]);
        }

        System.out.println(myList);

        //      재귀함수 잘 쓸 줄 몰라서...ㅎㅎ스택으로 풀었습니다...ㅎㅎ 재귀함수도 정진하겠습니다.
        Stack<Integer> myStack = new Stack<>();
        //      어디로 이동하는지 확인하기 위해서 사용하는 List
        List<Integer> subList =new ArrayList<>();

        //      연결된 줄기 개수를 세어줄 도구
        int count =0;

        //      node번호가 0부터 시작하므로 1~node +1까지
        //      간선이 끊겨있는 경우에는 확인이 안되므로 모든 node를 check해야함.
        for(int i=1; i< node+1;i++){
            //      간선이 끊겨있는 경우에는 이미 방문처리가 true로 바뀌어 있을 것이기 때문에
            //      false일 때에만 dfs 진행.
            if(visited[i]==false){
                dfs(i,myStack,subList,visited,myList);
                count++;
            }
        }

        System.out.println(subList);
        System.out.println(count);

    }

    //      이 밑에는 정말 외워도 외워도 잘 안외워지네요... 신정 때 10회 반복 진행 하겠습니다...ㅠㅠ

    private static void dfs(int start, Stack<Integer> stack , List<Integer> subList, boolean[] visited, List<List<Integer>> myList){
        stack.add(start);
        visited[1]=true;
        while (!stack.isEmpty()){
            int now = stack.pop();
            subList.add(now);
            for(int i=0; i<myList.get(now).size();i++){
                int node = myList.get(now).get(i);
                if(!subList.contains(node)&&visited[node]==false){
                    stack.add(node);
                    visited[node]=true;
                }
            }

        }
    }




}
