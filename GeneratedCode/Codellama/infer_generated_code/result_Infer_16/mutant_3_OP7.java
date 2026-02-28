import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        while (false) {
            // Unreachable while loop
            System.out.println("Unreachable code");
        }
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    }
}