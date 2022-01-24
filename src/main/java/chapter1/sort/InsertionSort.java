package chapter1.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,2,4,6,1,3};
        for (int i=1;i<arr.length;i++){
            Integer key = arr[i];
            Integer j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
}
