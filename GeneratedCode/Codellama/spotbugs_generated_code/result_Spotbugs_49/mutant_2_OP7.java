import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;

        // Inserted Unreachable while loop
        while(false) {
            // Code in this loop will never be executed
            System.out.println("This code is unreachable");
        }

        System.out.println(arr[index]); // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}