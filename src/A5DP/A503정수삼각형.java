package A5DP;

import java.util.*;

public class A503정수삼각형 {//프로그래머스
    public static void main(String[] args) {

        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        List<List<Integer>> myList = new ArrayList<>();
        int[] arr = new int[triangle[triangle.length-1].length];
        for(int i=1;i<triangle.length;i++){
            for(int j=0; j<triangle[i].length;j++){
                if(j==0){
                    triangle[i][0]+=triangle[i-1][0];
                } else if (j==triangle[i].length - 1) {
                    triangle[i][j]+=triangle[i-1][j-1];
                }else {
                    triangle[i][j]+=Math.max(triangle[i-1][j-1],triangle[i-1][j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(triangle));
        System.out.println(Arrays.stream(triangle[triangle.length-1]).max().getAsInt());



    }
}
