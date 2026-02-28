import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1

        // Mutant 1: Equivalent Loop Replacement
        do {
            n = n + 3;
            m = n;
        } while (n < Integer.MAX_VALUE);
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    }
}