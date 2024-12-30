package 문제를풉시다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class 카드정렬하기_백준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       //값 받는 부분
        int n = Integer.parseInt(br.readLine());        //      첫번째 값 받기
        Queue<Integer> myQue = new PriorityQueue<>();       //      작은 값을 받아야하기 때문에 pq사용. 초기화 과정

        for(int i=0; i<n;i++){      //      n개의 값 queue에 넣어주기
            myQue.add(Integer.parseInt(br.readLine()));
        }

        int answer = 0;     //      제출할 답 초기화
        while (!myQue.isEmpty()){
            if(myQue.size()==1){        //      poll을 두개 씩 할 수 있는지 검증. 마지막 값이 답이므로 1개일 때 정지
                break;
            }
            int temp = myQue.poll()+myQue.poll();       // 가장 작은 값을 더했을 때 최솟값이 나옴. 값을 미리 뽑아놓고 변수에 담아놓는다.
            answer+= temp;
            myQue.add(temp);

        }
        System.out.println(answer);

    }
}
