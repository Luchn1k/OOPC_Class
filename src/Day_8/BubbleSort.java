package Day_8;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] inputArray) {
        // not needed this is for not changing the original array
        int[]  arr =   Arrays.copyOf(inputArray,inputArray.length);
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
        return arr;
    }

    public  static void main(String args[]){
        int[] arr  = {10,50,4,1,100,45,3};
        int[] sorted  = bubbleSort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }


}
