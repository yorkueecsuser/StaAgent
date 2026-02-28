import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Unreachable if statement added
        boolean condition = checkCondition();
        if (condition) {
            System.out.println("This is unreachable code.");
        }

        return numbers.toString(); // BUG: ArrayToString
    }
    
    // Method to ensure the condition is dynamically determined at runtime
    private boolean checkCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}