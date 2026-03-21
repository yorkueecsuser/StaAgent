import java.util.ArrayList;
import java.util.List;

class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int jcvmslwc = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < jcvmslwc; i++) {
            numbers.add(i);
        }
        int eiltcjyi = 10;
        for (int i = 0; i < jcvmslwc; i++) {
            eiltcjyi = incr(eiltcjyi); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(eiltcjyi);
    }

    private static int incr(int x) {
        return x + 1;
    }
}