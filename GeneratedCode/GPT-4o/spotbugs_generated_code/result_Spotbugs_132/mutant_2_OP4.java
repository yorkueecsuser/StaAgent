import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        // Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This will never print.");
        } else {
            // This block executes
            System.out.println("The unreachable condition is false.");
        }

        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public boolean getUnreachableCondition() {
        // Always returns false making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);
    }
}