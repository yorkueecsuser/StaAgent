import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        if (false) {
            System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
        }
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    }
}