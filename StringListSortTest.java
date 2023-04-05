import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<Integer> inputNums;
        ArrayList<Integer> expectedOutput;
        ArrayList<Integer> actualOutput;

        
        inputNums = new ArrayList<>(Arrays.asList(5,1,2,7,9,0,6));
        expectedOutput = new ArrayList<>(Arrays.asList(0,1,2,5,6,7,9));;
        actualOutput = StringListSort.selectionSort(inputNums);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInsertionSort() {
        ArrayList<Integer> inputNums;
        ArrayList<Integer> expectedOutput;
        ArrayList<Integer> actualOutput;

        
        inputNums = new ArrayList<>(Arrays.asList(5,1,2,7,9,0,6));
        expectedOutput = new ArrayList<>(Arrays.asList(0,1,2,5,6,7,9));;
        actualOutput = StringListSort.selectionSort(inputNums);
        assertEquals(expectedOutput, actualOutput);
    }
}
