import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        System.out.println(arr[index]); // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)

        // Unreachable while loop mutation operator
        boolean condition = getCondition();
        while (condition) {
            // Placeholder for unreachable code
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}