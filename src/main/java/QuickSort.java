import java.util.Arrays;

public class QuickSort {
    public static final int[] array = {4, -2, 8, 0, 12, 4, -3, 8, 1};

    public static void main(String[] args) {
        int[] copyArray = Arrays.copyOf(array,array.length);
        quickSort(copyArray, 0, copyArray.length-1);
        System.out.println(Arrays.toString(copyArray));
    }

    public static void quickSort(int[] array, int low, int hi) {
        if (low >= hi) return;
        int j = partition(array, low, hi);
        quickSort(array,low,j-1);
        quickSort(array,j+1,hi);
    }

    private static int partition(int[] array, int low, int hi) {
        int i = low + 1;
        int j = hi;
        int v = array[low];
        while (i <= j) {
            while (i <= hi && array[i] < v) {
                i++;
            }
            while (j >= low && array[j] > v) {
                j--;
            }
            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        int tmp = array[low];
        array[low] = array[j];
        array[j] = tmp;
        return j;
    }
}
