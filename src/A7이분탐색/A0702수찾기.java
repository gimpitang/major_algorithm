package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A0702수찾기 {//       백준 1920
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        String [] firstArr = br.readLine().split(" ");
        int second = Integer.parseInt(br.readLine());
        String [] secondArr = br.readLine().split(" ");

        int []firstIntArr = new int[firstArr.length];
        int []secondIntArr = new int[firstArr.length];

        for(int i=0; i<firstArr.length; i++){
            firstIntArr[i] = Integer.parseInt(firstArr[i]);
        }
        for(int i=0; i<secondArr.length; i++){
            secondIntArr[i] = Integer.parseInt(secondArr[i]);
        }
        Arrays.sort(firstIntArr);


        for (int i = 0; i<secondIntArr.length; i++){
            if(Arrays.binarySearch(firstIntArr,secondIntArr[i])<0){
                System.out.println(0);
            }else {
                System.out.println(1);
            }
        }


    }
}
