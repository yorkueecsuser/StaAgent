import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        // Unreachable for loop
        boolean isUnreachable = getUnreachableCondition();
        for (int i = 0; isUnreachable; i++) {
            System.out.println("This loop is unreachable.");
        }
        
        // Original buggy code
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    // Method to ensure the loop is unreachable
    private boolean getUnreachableCondition() {
        return false; // Ensure dynamic evaluation to avoid compile-time constant
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);
    }
}