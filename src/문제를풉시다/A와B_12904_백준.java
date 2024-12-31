package 문제를풉시다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class A와B_12904_백준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        String S = "B";
        String T = "ABBA";


        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        int answer =0;

        while (sb1.length()<sb2.length()){
            if(sb1.compareTo(sb2) == 0){
                answer=1;
                break;
            }
            if(sb2.charAt(sb2.length()-1)=='A'){
                sb2.deleteCharAt(sb2.length()-1);
            }else {
                sb2.deleteCharAt(sb2.length()-1).reverse();
            }
            if(sb1.compareTo(sb2) == 0){
                answer=1;
                break;
            }


        }
        System.out.println(answer);

    }
}
