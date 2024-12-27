import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int V = Integer.parseInt(inputs[2]);
        int sum = 1;


        if(V%(A-B)>0){
            sum=V/(A-B)+1;
        } else if (V%(A-B)==0) {
            sum=V/(A-B)-B;
        }


        System.out.println(sum);
    }
}
