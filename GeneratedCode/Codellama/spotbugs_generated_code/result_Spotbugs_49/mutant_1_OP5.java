import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        System.out.println(arr[index]); // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)

        // Inserted unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // Code that will never execute
                System.out.println("Unreachable code");
                break;
            default:
                // Additional unreachable code
                System.out.println("More unreachable code");
                break;
        }
    }

    // Helper method to provide a value for the switch expression
    private static int getValue() {
        return 0;
    }
}