import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        String[] num= br.readLine().split(" ");
        int[] real = new int[num.length];
        for(int i =0; i< num.length;i++){
            real[i]=Integer.parseInt(num[i]);
        }
        Arrays.sort(real);

        int answer = 0;
        if(n%2==0){
            answer =real[0]*real[real.length-1];
        }else if(n%2==1){
            answer= real[real.length/2]*real[real.length/2];
        }
        System.out.println(Arrays.toString(num));
        System.out.println(answer);
    }
}
