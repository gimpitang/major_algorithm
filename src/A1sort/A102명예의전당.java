package A1sort;

import java.util.*;


public class A102명예의전당 {//      프로그래머스
    public static void main(String[] args) {
        int k = 4;
        int [] score ={0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        Queue<Integer> pq = new PriorityQueue<>();
        int [] answer = new int[score.length];

        for(int i=0; i< score.length;i++){

            pq.add(score[i]);
            if(pq.size()>k){
                pq.poll();
            }
            answer[i]=pq.peek();
        }
        System.out.println(pq);
        System.out.println(Arrays.toString(answer));

    }

}
