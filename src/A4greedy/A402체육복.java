package A4greedy;

import java.util.Arrays;

public class A402체육복 {//프로그래머스
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {4,5};
        int[] reserve = {3,4};
        int[] people = new int[n+1];

        Arrays.fill(people,1);

        for (int i =0;i<lost.length; i++){
            people[lost[i]]--;
        }
        for (int i =0;i<reserve.length; i++){
            people[reserve[i]]++;
        }
        for (int i=1;i<people.length;i++){
            if(people[i]==2&&people[i-1]==0){
                people[i]=1;
                people[i-1]=1;

            } else if(i+1<people.length &&people[i]==2&&people[i+1]==0){
                people[i]=1;
                people[i+1]=1;
            }
        }
        people[0]=0;

        System.out.println(Arrays.toString(people));
        int answer =0;
        for (int i=0;i< people.length;i++){
            if(people[i]!=0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
