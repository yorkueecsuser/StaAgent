import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] kxopxnhr = {1, 2, 3, 4, 5};
        int wauofcoc = 6;
        int geghsioh = wauofcoc + 1;
        System.out.println(kxopxnhr[geghsioh]); // BUG: RANGE: Array wauofcoc is out of bounds (RANGE_ARRAY_OFFSET)
    }
}