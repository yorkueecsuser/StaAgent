import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        boolean conditionWhile = getCondition(); // Dynamically determined condition
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This will never be printed.");
            conditionWhile = false; // To prevent unreachable statement error
        }
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    // Helper method to provide a condition for the while loop
    private boolean getCondition() {
        return false; // Always false to ensure the loop is unreachable
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);
    }
}