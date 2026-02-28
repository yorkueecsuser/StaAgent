import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        boolean conditionFor = getCondition();
        for (int i = 0; i < m; i++) {
            System.out.println(i);
        }
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    }
}