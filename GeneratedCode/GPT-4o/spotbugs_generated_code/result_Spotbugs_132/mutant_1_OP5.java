import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        // Unreachable switch statement inserted
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1001: // This case will never be reached because unreachableValue will never be 1001
                System.out.println("This statement is unreachable.");
                break;
            default:
                // Default case to avoid unreachable statement error
                break;
        }
        
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    // Method to simulate dynamic condition
    private int getUnreachableValue() {
        return -1; // Always returns -1, making the switch case unreachable
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);
    }
}