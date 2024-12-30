package A7이분탐색;

import java.util.Arrays;

public class A0701BinaryBasic2 {
    public static void main(String[] args) {
        //      타겟이 있다면, index값 return
        //      target이 arr에 없다면  있어야할 index를 return
        int[] arr={1,3,5,7,9,11,13,15,17,19};
        int target=2;
        int answer = -1;

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int middle=(start+end)/2;

            if(arr[middle]>target){
                end=middle-1;
            } else if (arr[middle]<target) {
                start=middle+1;
            } else if (arr[middle]==target) {
                answer=middle;
                break;
            }

        }


        System.out.println(answer);
        System.out.println(Arrays.binarySearch(arr,0));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,20));

        int answer2 = Arrays.binarySearch(arr,target);
        if(answer2<0){
            System.out.println(Math.abs((answer2)-1));
        }else {
            System.out.println(answer2);
        }
    }
}
