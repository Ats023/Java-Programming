//create heap data structure

import java.util.*;

class MaxHeap {
    int[] heapArray;
    MaxHeap(int[] arr) {
        heapArray = Arrays.copyOf(arr, arr.length);
        int idx = arr.length/2-1;
        for(int i=idx; i>=0; i--) {
            heapify(arr,arr.length,i);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i, leftChild = i*2+1, rightChild = i*2+2;
        if(leftChild<n && arr[leftChild]>arr[largest]) largest = leftChild;
        if(rightChild<n && arr[rightChild]>arr[largest]) largest = rightChild;
        if(largest!=i) {
            int temp=arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    void display() {
        for(int x: heapArray) System.out.print(x+" ");
    }
}

public class HeapDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,2,4,9,8};
        MaxHeap obj = new MaxHeap(arr);
        obj.display();
    }
}
