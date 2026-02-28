import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Unreachable if-else branch
        boolean isFalse = getFalseCondition();
        if (isFalse) {
            System.out.println("This is an unreachable branch.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return numbers.toString(); // BUG: ArrayToString
    }

    // Method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}