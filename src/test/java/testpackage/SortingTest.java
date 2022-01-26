package testpackage;

import org.junit.Test;

public class SortingTest {

    @Test
    public void insertionTest(){
        Integer[] arr = new Integer[]{2,4,5,6,1,3};
        for (int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i -1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
    @Test
    public void selectionSort(){
        Integer[] arr = new Integer[]{5,2,4,6,1,3};
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j=0;j<arr.length;j++){
                if (arr[minIndex] < arr[j]) minIndex=j;
            }
             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] =temp;
        }
    }
}
