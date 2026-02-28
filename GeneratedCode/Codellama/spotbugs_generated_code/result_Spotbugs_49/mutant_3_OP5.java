import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        switch (getCondition()) {
            case 1:
                // code
                break;
            default:
                // alternative code
                break;
        }
        System.out.println(arr[index]); // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}