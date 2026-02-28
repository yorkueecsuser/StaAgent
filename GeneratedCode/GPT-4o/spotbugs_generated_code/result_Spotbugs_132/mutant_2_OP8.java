import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    // Mutated method with renamed variables
    public String showBugMutant(int[] x) {
        return x.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringExample y = new ArrayToStringExample();
        int[] z = {1, 2, 3, 4, 5};
        String result = y.showBug(z);
        System.out.println("Result of toString on array: " + result);

        // Mutated code execution
        String mutatedResult = y.showBugMutant(z);
        System.out.println("Mutated result of toString on array: " + mutatedResult);
    }
}