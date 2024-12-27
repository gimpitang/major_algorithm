import java.util.*;

public class 연습장 {
    public static void main(String[] args) {
        String name ="JAAAAANA";
        int answer =0;
        Map<Character,Integer> myMap = new HashMap<>();
        myMap.put('A',0);
        myMap.put('B',1);
        myMap.put('C',2);
        myMap.put('D',3);
        myMap.put('E',4);
        myMap.put('F',5);
        myMap.put('G',6);
        myMap.put('H',7);
        myMap.put('I',8);
        myMap.put('J',9);
        myMap.put('K',10);
        myMap.put('L',11);
        myMap.put('M',12);
        myMap.put('N',13);
        myMap.put('O',-12);
        myMap.put('P',-11);
        myMap.put('Q',-10);
        myMap.put('R',-9);
        myMap.put('S',-8);
        myMap.put('T',-7);
        myMap.put('U',-6);
        myMap.put('V',-5);
        myMap.put('W',-4);
        myMap.put('X',-3);
        myMap.put('Y',-2);
        myMap.put('Z',-1);

        String [] stArr = new String[name.length()];
        for(int i=0; i<name.length();i++){
            stArr[i]= String.valueOf(name.charAt(i));
        }
        System.out.println(Arrays.toString(stArr));
        int sum =0;
        int[] mapArr= new int[name.length()];
        for(int i=0; i<name.length(); i++){
            sum+=Math.abs(myMap.get(name.charAt(i)));
            mapArr[i]=Math.abs(myMap.get(name.charAt(i)));
        }
        System.out.println(Arrays.toString(mapArr));

        int pointerStatement =0;
        int leftMove =0;
        int rightMove=0;


        answer = sum;
        System.out.println(answer);

    }
}
