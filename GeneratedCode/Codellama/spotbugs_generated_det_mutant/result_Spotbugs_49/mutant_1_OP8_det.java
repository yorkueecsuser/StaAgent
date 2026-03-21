import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] hnengjig = {1, 2, 3, 4, 5};
        int jznzescx = 6;
        int yuyrugyz = jznzescx + 1;
        System.out.println(hnengjig[yuyrugyz]); // BUG: RANGE: Array jznzescx is out of bounds (RANGE_ARRAY_OFFSET)
    }
}