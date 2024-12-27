package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A603숫자의표현 { //     숫자의 표현
    public static void main(String[] args) {
        int n = 15;
        int[] sequence = new int[n];
        for(int i=1; i<n+1; i++){
            sequence[i-1]=i;
        }
        System.out.println(Arrays.toString(sequence));
        int start = 0;
        int end = 0;
        int total = sequence[0];
        List<int[]> list = new ArrayList<>();
        while (start <= end && end<sequence.length){
            if(total == n){
                list.add(new int[]{start, end});
                total -= sequence[start];
                start++;
            }else if(total > n){
                total -= sequence[start];
                start++;
            }else if(total < n){
                if(end<sequence.length-1){
                    end++;
                    total += sequence[end];
                }else {
                    end++;
                }
            }
        }


        System.out.println(list.size());
    }
}
