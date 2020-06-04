import java.util.Arrays;

public class Main {
    public static final int[] array = {4, -2, 8, 0, 12, 4, -3, 8, 1};
    private static int[] workSpace = new int[array.length];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        selectionSort(array);
        insertionSort(array);

        int[] copyArray = Arrays.copyOf(array,array.length);
        mergeSort(copyArray, 0, copyArray.length-1);
        System.out.println(Arrays.toString(copyArray));

        int[] copyArray2 = Arrays.copyOf(array,array.length);
        quickSort(copyArray2, 0, copyArray.length-1);
        System.out.println(Arrays.toString(copyArray2));

    }


//    Output:
//            [4, -2, 8, 0, 12, 4, -3, 8, 1]
//            [-2, 4, 0, 8, 4, -3, 8, 1, 12]
//            [-2, 0, 4, 4, -3, 8, 1, 8, 12]
//            [-2, 0, 4, -3, 4, 1, 8, 8, 12]
//            [-2, 0, -3, 4, 1, 4, 8, 8, 12]
//            [-2, -3, 0, 1, 4, 4, 8, 8, 12]
//            [-3, -2, 0, 1, 4, 4, 8, 8, 12]
//            [-3, -2, 0, 1, 4, 4, 8, 8, 12]
//            [-3, -2, 0, 1, 4, 4, 8, 8, 12]
    public static int[] bubbleSort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
            System.out.println(Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

//    Output:
//            [4, -2, 8, 0, 12, 4, -3, 8, 1]
//            [-3, -2, 8, 0, 12, 4, 4, 8, 1]
//            [-3, -2, 8, 0, 12, 4, 4, 8, 1]
//            [-3, -2, 0, 8, 12, 4, 4, 8, 1]
//            [-3, -2, 0, 1, 12, 4, 4, 8, 8]
//            [-3, -2, 0, 1, 4, 12, 4, 8, 8]
//            [-3, -2, 0, 1, 4, 4, 12, 8, 8]
//            [-3, -2, 0, 1, 4, 4, 8, 12, 8]
//            [-3, -2, 0, 1, 4, 4, 8, 8, 12]
//            [-3, -2, 0, 1, 4, 4, 8, 8, 12]
    public static int[] selectionSort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < sortedArray.length; i++) {
            int min = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[min]) {
                    min = j;
                }
            }
            int tmp = sortedArray[i];
            sortedArray[i] = sortedArray[min];
            sortedArray[min] = tmp;
            System.out.println(Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

//    Output:
//        [4, -2, 8, 0, 12, 4, -3, 8, 1]
//        [-2, 4, 8, 0, 12, 4, -3, 8, 1]
//        [-2, 4, 8, 0, 12, 4, -3, 8, 1]
//        [-2, 0, 4, 8, 12, 4, -3, 8, 1]
//        [-2, 0, 4, 8, 12, 4, -3, 8, 1]
//        [-2, 0, 4, 4, 8, 12, -3, 8, 1]
//        [-3, -2, 0, 4, 4, 8, 12, 8, 1]
//        [-3, -2, 0, 4, 4, 8, 8, 12, 1]
//        [-3, -2, 0, 1, 4, 4, 8, 8, 12]
    public static int[] insertionSort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 1; i < sortedArray.length; i++) {
            int j = i;
            while (j > 0 && sortedArray[j] < sortedArray[j - 1]) {
                int tmp = sortedArray[j];
                sortedArray[j] = sortedArray[j - 1];
                sortedArray[j - 1] = tmp;
                j--;
            }
            System.out.println(Arrays.toString(sortedArray));
        }
        return sortedArray;
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
