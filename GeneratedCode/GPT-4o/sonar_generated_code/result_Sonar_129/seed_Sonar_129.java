import java.util.Arrays;

class CustomNumber implements Comparable<CustomNumber> {
    private int value;

    public CustomNumber(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CustomNumber other) {
        if (this.value == other.value) {
            return 0;
        }
        return this.value - other.value < 0 ? Integer.MIN_VALUE : 1; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    }

    public static int[] showBug(CustomNumber[] numbers) {
        Arrays.sort(numbers);
        int[] sortedValues = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedValues[i] = numbers[i].value;
        }
        return sortedValues;
    }

    public static void main(String[] args) {
        CustomNumber[] numbers = {
            new CustomNumber(3),
            new CustomNumber(1),
            new CustomNumber(2)
        };
        int[] sortedValues = showBug(numbers);
        for (int value : sortedValues) {
            System.out.println(value);
        }
    }
}