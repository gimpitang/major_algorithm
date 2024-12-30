package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A0703과자나눠주기 {//      백준 과자나눠주기 16401
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stInputs= br.readLine().split(" ");
        String[] stLength= br.readLine().split(" ");
        int [] inputs= new int[stInputs.length];
        int [] length= new int[stLength.length];
        for (int i = 0; i< stInputs.length;i++){
            inputs[i] = Integer.parseInt(stInputs[i]);
        }
        int people = inputs[0];
        int snacks = inputs[1];
        for (int i = 0; i< stLength.length;i++){
            length[i]= Integer.parseInt(stLength[i]);
        }
        Arrays.sort(length);

        int start =1;
        int end = length[length.length-1];
        int answer =0;

        while (start<=end){
            int middle =(start+end)/2;
            int count=0;
            for (int i=0; i< length.length;i++){
                count+=length[i]/middle;
            }

            if (people<=count){
                answer=middle;
                start=middle+1;
            } else if(people>count) {
                end=middle-1;

            }
        }
        System.out.println(answer);
    }
}
