import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1

        // Mutated code
        boolean condition = getCondition();
        while (condition) {
            int i = 0;
            i++;
        }
    }

    static boolean getCondition() {
        return false;
    }
}