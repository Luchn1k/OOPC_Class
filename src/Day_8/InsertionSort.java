package Day_8;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n ; i ++){
            int key  = arr[i];
            int j = i -1;

            while ( j >= 0 && arr[j] > key){
                arr[ j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }
    public  static void main(String args[]){
        int[] arr  = {10,50,4,1,100,45,3};
        insertionSort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }

}
