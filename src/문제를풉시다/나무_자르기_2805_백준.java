package 문제를풉시다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나무_자르기_2805_백준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");
        int trees = Integer.parseInt(first[0]);
        int targetSum = Integer.parseInt(first[1]);

        int [] treeArr = new int [second.length];
        for(int i=0; i<second.length;i++){
            treeArr[i]=Integer.parseInt(second[i]);
        }
        Arrays.sort(treeArr);
        long answer =0;                 //      강사님 진짜 어떤 나무가 이리 큰겁니까... 진짜 현타 세게 왔습니다...ㅎㅎ
        long start = 0;                 //      오늘 배운 과자 나누는 문제랑 완전 똑같은 문제였습니다.
        long end = treeArr[treeArr.length-1];
        while (start<=end){
            long sumOfTree=0;
            long middle = (start+end)/2;

            for(int i=0; i<treeArr.length;i++){
                long temp =treeArr[i]-middle;
                if(temp>=0){
                    sumOfTree +=temp;
                }
            }



            if(sumOfTree >=targetSum){

                answer=middle;
                start= middle+1;

            } else if (sumOfTree <targetSum) {
                end=middle-1;
            }

        }


        System.out.println(answer);
    }
}
