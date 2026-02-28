import java.util.Arrays;

class ArrayToStringExample {

    public String showBug(int[] numbers) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block is intentionally left empty
        }
        
        return numbers.toString(); // BUG: ArrayToString
    }

    // Method to simulate a condition that always returns false
    private boolean getCondition() {
        return false; // Ensures the for loop is always unreachable
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers);
        System.out.println("Result: " + result);
    }
}