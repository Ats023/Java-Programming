public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr = {0,2,5,1,2,7,8};
        mergeSort(arr, 0, arr.length-1);
        for(int x: arr) System.out.print(x+" ");
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left<right) {
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int nl = mid-l+1, nr = r-mid;
        int[] leftArray = new int[nl];
        int[] rightArray = new int[nr];
        
        System.arraycopy(arr, l, leftArray, 0, nl);
        System.arraycopy(arr, mid+1, rightArray, 0, nr);

        int i=0, j=0, k=l;
        while(i<nl && j<nr) {
            if(leftArray[i]<=rightArray[j]) arr[k++] = leftArray[i++];
            else arr[k++] = rightArray[j++];
        }
        while(i<nl) {
            arr[k++] = leftArray[i++];
        }
        while(j<nr) {
            arr[k++] = rightArray[j++];
        }
    }
}
