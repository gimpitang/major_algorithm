package A5DP;

import java.util.*;

public class A502멀리뛰기 {//       프로그래머스
    public static void main(String[] args) {

        int n =10;
        Queue<Integer>myQue = new LinkedList<>();
        int[] arr = new int[n+1];
        arr[0] =1;
        arr[1] =1;
        for(int i = 2; i<=n;i++ ){
            arr[i]=(arr[i-1]%1234567+arr[i-2]%1234567)%1234567;

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);



    }


}
