import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    @Test
    public void bubbleSortTest() {
        assertArrayEquals(new int[]{-2,0,2,4,4,5,10,12}, Main.bubbleSort(new int[]{4,-2,5,0,2,4,12,10}));
    }

    @Test
    public void selectionSortTest() {
        assertArrayEquals(new int[]{-2,0,2,4,4,5,10,12}, Main.selectionSort(new int[]{4,-2,5,0,2,4,12,10}));
    }

    @Test
    public void insertionSortTest() {
        assertArrayEquals(new int[]{-2,0,2,4,4,5,10,12}, Main.insertionSort(new int[]{4,-2,5,0,2,4,12,10}));
    }
}
