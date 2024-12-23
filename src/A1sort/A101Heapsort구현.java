package A1sort;

import java.util.PriorityQueue;
import java.util.*;

public class A101Heapsort구현 {
    public static void main(String[] args) {
        Queue<Integer> pq =new PriorityQueue<>();
        int[] arr ={7,6,5,8,3,5,9,1,6};
        //      최초 힙 구성
        for(int i = arr.length/2-1; i>=0;i--){
            heapify(i);
        }


    }

    static void heapify(int parent){
        int left = parent*2+1;
        int right = parent*2+2;
        //      check1 : 왼쪽 오른쪽 노드가 배열의 길이보다 짧아야함.
        if(left>= ) return;
        if(right>= ) return;

    }

}
