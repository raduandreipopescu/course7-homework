package extraMile;

import java.util.Arrays;

public class SortPairsImproved {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 2, 5, 3, 1, 7, 7, 9, 5, 4, 6};
        int target = 14;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            boolean foundPair = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && !foundPair && numbers[i] != 0 && numbers[j] != 0) {
                    System.out.printf("(%d,%d)", numbers[i], numbers[j]);
                    numbers[j] = 0;
                    foundPair = true;
                }
            }
        }
    }
}
