import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Introduce a non-final variable to ensure the while loop is unreachable but compiles
        boolean isUnreachable = getCondition();
        while (isUnreachable) {
            System.out.println("This will never be printed");
        }

        return numbers.toString(); // BUG: ArrayToString
    }

    // Method to provide a dynamic condition for the unreachable while loop
    private boolean getCondition() {
        return false; // Ensures that the while loop is unreachable
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}