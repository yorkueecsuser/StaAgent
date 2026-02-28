import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1

        // Mutant code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is also unreachable");
        }
    }
}