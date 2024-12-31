package 문제를풉시다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 좋다_1253_백준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String [] stNumbers = br.readLine().split(" ");
        int [] numbers =new int[num];
        for(int i=0; i<num;i++){
            numbers[i]=Integer.parseInt(stNumbers[i]);
        }
        Arrays.sort(numbers);       //      값입력 + 초기 설정 (투포인터Basic에서 밑에 부분 참고하여 풀었습니다.)


        List<List<int[]>> myList = new ArrayList<>(); //        값 배열을 담을 List 설정


        for (int i=0; i<numbers.length;i++) {       //      int배열에 있는 값에 대한 것을 찾아야하므로 for문 돌렸습니다.
            List<int[]> innerList =new ArrayList<>();       //      더한 조합을 담을 List입니다.
            int startIndex = 0;
            int endIndex =numbers.length-1;

            while (startIndex<endIndex){
                //---------------------------------------------------------------------------------------
                if(startIndex==i){      //      이 구문이 바로 아래 if문 안에
                    startIndex++;       //      startIndex != i && endIndex != i 이 형태로 있을 경우
                    continue;           //      두 index 중 하나가 만족하여 값이 도출되는 상황에서
                }                       //      상기 조건을 만족하지 않기 때문에 두 index가 같이 움직여 버리는 오류 발생함
                if(endIndex==i){        //      둘 다 i와 같지 않아야 하는 것은 맞지만 start가 i일 때는 start++을 해줘야함.(윗줄과 같은 이야기)
                    endIndex--;
                    continue;
                }
                //----------------------------------------------------------------------------------------
                if (numbers[startIndex]+numbers[endIndex]==numbers[i]){
                         //      질문하기 게시판에서 인사이트 얻어서 자신이 선택되지 않도록 처리했습니다.
                    innerList.add(new int[]{numbers[startIndex], numbers[endIndex]});

                    startIndex++;
                    endIndex--;
                } else if (numbers[startIndex]+numbers[endIndex]>numbers[i]) {
                    endIndex--;
                } else if (numbers[startIndex]+numbers[endIndex]<numbers[i]) {
                    startIndex++;
                }
            }
            myList.add(innerList);
        }
        int count =0;

        for(int i=0; i<myList.size(); i++) {
            if(!myList.get(i).isEmpty()){
                count++;
            }

        }
        System.out.println(count);
    }
}
