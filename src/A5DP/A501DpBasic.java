package A5DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A501DpBasic {
    public static void main(String[] args) {
        //      1,4,5로 13을 만들 수 있는 조합 중에 가장 작은 조합의 개수
        //      greedy로 풀 경우: 5개(5*2 + 1*3)
        //      dfs,bfs로 풀 경우 일반적으로 시간초과 나도록 설계

        //      dp로 풀 경우 3개(4*2 + 5*1)
        //      Min(f(n-1),f(n-2) ...) +1
        int target = 13;
        int[] numbers = {1,4,5};
        int[] arr = new int[target+1];
        arr[1]=1;
        for (int i=2; i<arr.length; i++){ //        index를 정하는 for문
            int min = Integer.MAX_VALUE;
            for(int n :numbers){
                if(i-n >= 0 && min > arr[i-n]){
                    min =arr[i-n];
                }
            }
            arr[i]=min+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
