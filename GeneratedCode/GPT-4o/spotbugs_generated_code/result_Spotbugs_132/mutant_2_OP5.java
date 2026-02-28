import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        // Original buggy code
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }
    
    private int getUnreachableValue() {
        return 2; // This will be used to ensure the switch statement is unreachable
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);

        // Adding unreachable switch statement
        int unreachableValue = example.getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 3:
                System.out.println("This is also unreachable.");
                break;
            default:
                // Do nothing
                break;
        }
    }
}