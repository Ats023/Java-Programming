import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {0,2,5,1,2,7,8};
        quickSort(arr, 0, arr.length-1);
        for(int x: arr) System.out.print(x+" ");
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i=low-1;
        for(int j=low; j<high; j++) {
            if(arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = pivot;
        pivot = temp;
        return i+1;
    }
}
