import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] cqsefxnw = {1, 2, 3, 4, 5};
        int xllucvjl = 6;
        int jefxvehv = xllucvjl + 1;
        System.out.println(cqsefxnw[jefxvehv]); // BUG: RANGE: Array xllucvjl is out of bounds (RANGE_ARRAY_OFFSET)
    }
}