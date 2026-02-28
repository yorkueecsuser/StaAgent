import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        System.out.println(arr[index]); // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)

        // Add unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}