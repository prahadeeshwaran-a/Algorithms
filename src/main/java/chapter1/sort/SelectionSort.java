package chapter1.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,2,4,6,1,3};

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[minIndex])
                    minIndex = j ;
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] =temp;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
