import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Unreachable for loop - the condition is always false
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be printed.");
        }

        return numbers.toString(); // BUG: ArrayToString
    }

    // Method to provide a false condition dynamically
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}