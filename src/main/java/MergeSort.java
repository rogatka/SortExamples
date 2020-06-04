import java.util.Arrays;

public class MergeSort {
    public static final int[] array = {4, -2, 8, 0, 12, 4, -3, 8, 1};
    private static int[] workSpace = new int[array.length];


    public static void main(String[] args) {
        int[] copyArray = Arrays.copyOf(array,array.length);
        mergeSort(copyArray, 0, copyArray.length-1);
    }

    public static void mergeSort(int[] array, int low, int hi) {
        if (low >= hi) return;
        int mid = low + (hi - low)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,hi);
        merge(array,low,mid,hi);
    }

    private static void merge(int[] array, int low, int mid, int hi) {
        for (int i = low; i <= hi; i++) {
            workSpace[i] = array[i];
        }
        int i = low;
        int j = mid+1;

        for (int k = low; k <= hi; k++) {
            if (i <= mid && j <= hi) {
                if (workSpace[i] < workSpace[j]) {
                    array[k] = workSpace[i];
                    i++;
                }
                else {
                    array[k] = workSpace[j];
                    j++;
                }
            }
            else {
                if (i <= mid) {
                    array[k] = workSpace[i];
                    i++;
                }
                else if (j <= hi) {
                    array[k] = workSpace[j];
                    j++;
                }
            }
        }
    }
}
