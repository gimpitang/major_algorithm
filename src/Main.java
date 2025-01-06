import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.math.*;

public class Main {


    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    String[] stNumbers = br.readLine().split(" ");
    int[] numbers = new int[stNumbers.length];
    for(int i =0; i< stNumbers.length;i++){
        numbers[i]=Integer.parseInt(stNumbers[i]);
    }
    Arrays.sort(numbers);
    int answer =0;
    List<Integer> myList = new ArrayList<>();
    for(int i=0; i< numbers.length-2; i++){
        for(int j=i+1; j< numbers.length-1; j++){
            for(int k =j+1; k<numbers.length; k++){
                if(numbers[i]+numbers[j]+numbers[k]==Integer.parseInt(inputs[1])){
                    answer = Integer.parseInt(inputs[1]);
                }else {
                    myList.add(numbers[i]+numbers[j]+numbers[k]);
                }
            }
        }
    }
    if(answer!=0){
        System.out.println(answer);
        return;
    }
    myList.sort(Comparator.naturalOrder());
    for (int i=0; i<myList.size(); i++){
        if(myList.get(i)>Integer.parseInt(inputs[1])){
            answer = myList.get(i-1);
            break;
        }else {
            answer=myList.get(i);
        }
    }
        System.out.println(answer);
    }
}

