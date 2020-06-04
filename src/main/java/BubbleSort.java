import java.util.Arrays;

public class BubbleSort {
    public static final int[] array = {4, -2, 8, 0, 12, 4, -3, 8, 1};

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
        System.out.println(sortedArray);

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
}
