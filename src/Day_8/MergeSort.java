package Day_8;

import java.util.Arrays;

public class MergeSort {
    public static void  mergeSort(int[]  arr){
        if(arr.length <  2){
            return;
        }
        int mid =arr.length / 2 ;
        int[]  lhs = Arrays.copyOfRange(arr,0,mid);
        int[] rhs = Arrays.copyOfRange(arr,mid,arr.length);
        mergeSort(lhs);
        mergeSort(rhs);
        merge(lhs,rhs,arr);

    }

    public  static  void  merge(int [] left,int[] right, int[] arr){
        int i = 0 ,j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while(j < right.length){
            arr[k++] = right[j++];
        }
    }

    public  static void main(String args[]){
        int[] arr  = {10,50,4,1,100,45,3};
        mergeSort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }


}
