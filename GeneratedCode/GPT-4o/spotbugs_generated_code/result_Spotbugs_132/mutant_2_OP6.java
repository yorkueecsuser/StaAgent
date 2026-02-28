import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        // Unreachable for loop with a dynamic condition
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    // Method to provide a dynamic false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);
    }
}