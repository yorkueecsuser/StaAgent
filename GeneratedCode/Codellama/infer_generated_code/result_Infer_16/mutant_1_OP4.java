import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1

        // Unreachable if-else statement
        if (false) {
            // This branch is always false and unreachable
            System.out.println("This branch is unreachable");
        } else {
            // This branch is always true
            System.out.println("This branch is reachable");
        }
    }
}