import java.util.ArrayList;
import java.util.Arrays;

public class StringListSort {

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            int minIndex = i;
            int minVal = nums.get(i);
            for (int k = i+1; k < nums.size(); k++) {
                if (nums.get(k) < minVal) {
                    minVal = nums.get(k);
                    minIndex = k;
                }
            }
            int ph = nums.get(i);
            nums.set(i, nums.get(minIndex));
            nums.set(minIndex, ph);

        }
        return nums;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int k = i;

            while (i > 0 && nums.get(i-1) > nums.get(i)) {
                int ph = nums.get(k-1);
                nums.set(k-1,nums.get(k));
                nums.set(k, ph);
                k--;
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
    }
}