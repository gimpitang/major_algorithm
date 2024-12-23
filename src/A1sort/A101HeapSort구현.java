package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class A101HeapSort구현 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
        //        최초힙구성 : n*log(n)
        for(int i=arr.length/2-1; i>=0; i--){
            heapify(arr, i);
        }


        System.out.println(Arrays.toString(arr));//     최소힙

    }
    static void heapify(int[] arr, int parent){
        int left = parent*2+1;
        int right = parent*2+2;
//        check1 : 왼쪽, 오른쪽 노드가 배열의 길이보다 짧아야함
//        check2 : left, right 둘 중에 parent의 값보다 작은 값이 있을경우 자리 change 후 heapify 재귀호출.
        if(left >= arr.length)return;
        if(right >= arr.length){
//            left만 존재
            if(arr[parent] > arr[left]){
                int temp = arr[parent];
                arr[parent] = arr[left];
                arr[left] = temp;
                heapify(arr, left);
            }
        }else {
//            left, right 둘다 존재
            int index = 0;
            if(arr[parent] > arr[left] || arr[parent] > arr[right]){
                if(arr[left]> arr[right]){
                    index = right;
                }else {
                    index = left;
                }
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                heapify(arr, index);
            }
        }
    }
}