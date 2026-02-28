import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    // Mutated method with renamed variable
    public String showBugRenamed(int[] x) {
        return x.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);
        
        // Using the mutated method
        String mutatedResult = example.showBugRenamed(sampleArray);
        System.out.println("Result of toString on array with renamed method: " + mutatedResult);
    }
}