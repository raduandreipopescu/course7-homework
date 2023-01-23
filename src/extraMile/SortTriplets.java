package extraMile;

public class SortTriplets {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 2, 5, 3, 1, 9, 4, 6};
        int target = 15;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    for (int k = j; k < numbers.length; k++) {
                        if (numbers[k] != numbers[j]) {
                            if (numbers[i] + numbers[j] + numbers[k] == target) {
                                System.out.printf("(%d,%d,%d)", numbers[i], numbers[j], numbers[k]);
                            }
                        }
                    }
                }
            }
        }
    }
}
