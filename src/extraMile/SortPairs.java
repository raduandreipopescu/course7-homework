package extraMile;

public class SortPairs {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 2, 5, 3, 1, 7, 7};
        int target = 10;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    if (numbers[i] + numbers[j] == target) {
                        System.out.printf("(%d,%d)", numbers[i], numbers[j]);
                    }
                }
            }
        }
    }
}
