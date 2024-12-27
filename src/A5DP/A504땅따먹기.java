package A5DP;

import java.util.Arrays;

public class A504땅따먹기 {//       프로그래머스
    public static void main(String[] args) {
        int[][] land ={{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int answer =0;
        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                land[i][j]+=findMaxWithoutMe(j,land[i-1]);
            }
        }
        answer = Arrays.stream(land[land.length-1]).max().getAsInt();
        System.out.println(Arrays.stream(land[land.length-1]).max().getAsInt());
    }
    static int findMaxWithoutMe(int me, int[] land){
        int max =0;
        for(int i=0; i< land.length;i++){
            if(i==me)continue;
            if(max<land[i])max=land[i];
        }


        return max;
    }
}
