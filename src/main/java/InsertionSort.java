import java.util.Arrays;

public class InsertionSort {
    public static final int[] array = {4, -2, 8, 0, 12, 4, -3, 8, 1};

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
        System.out.println(Arrays.toString(sortedArray));

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
}
