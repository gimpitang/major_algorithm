package A4greedy;

import java.util.*;

public class A403구명보트 {// 프로그래머스
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        Deque<Integer> dq = new ArrayDeque<>();
        Arrays.sort(people);
        for(int a :people){
            dq.add(a);
        }
        int count =0;
        while (!dq.isEmpty()){
            if(dq.peekFirst()+dq.peekLast()>limit){
                dq.pollLast();
                count++;
            } else if (dq.peekFirst()+dq.peekLast()<=limit) {
                dq.pollLast();
                dq.pollFirst();
                count++;
            }
        }
        System.out.println(count);
    }
}
