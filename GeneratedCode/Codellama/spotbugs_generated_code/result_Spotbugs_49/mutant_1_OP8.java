import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        System.out.println(arr[index]); // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)

        // Mutant code: Renaming
        int[] arry = {1, 2, 3, 4, 5};
        int offst = 6;
        int idx = offst + 1;
        System.out.println(arry[idx]); // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}