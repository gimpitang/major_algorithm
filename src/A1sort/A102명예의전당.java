package A1sort;

import java.util.*;


public class A102명예의전당 {//      프로그래머스
    public static void main(String[] args) {
        int k = 3;
        int [] score ={10,100,20,1150,1,100,200};
        Queue<Integer> pq = new PriorityQueue<>();
        int [] answer = new int[score.length];

        for(int i =0; i< answer.length;i++){
            pq.add(score[i]);
            answer[i]=pq.peek();
        }






    }





}
