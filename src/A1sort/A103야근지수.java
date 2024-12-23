package A1sort;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class A103야근지수 {//       프로그래모스
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int n=3;
        int[] works={1,1};
        long answer = 0;
        long sum =0;
        for(int i = 0; i<works.length;i++){
            sum+=works[i];
        }
        System.out.println(sum);
        for (int i:works){
            pq.add(i);
        }
        System.out.println(pq);
        if(sum<n){
            answer=0;
        }else {
            for(int i =0; i<n;i++ ){
                int K= pq.poll();
                pq.add(K-1);
                System.out.println(pq);
            }

            while (!pq.isEmpty()){

                answer+=Math.pow(pq.poll(),2);
                System.out.println(answer);
            }

        }

        System.out.println(answer);






    }
}
