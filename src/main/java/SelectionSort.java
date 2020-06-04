import java.util.Arrays;

public class SelectionSort {
    public static final int[] array = {4, -2, 8, 0, 12, 4, -3, 8, 1};


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
        System.out.println(Arrays.toString(sortedArray));

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
}
