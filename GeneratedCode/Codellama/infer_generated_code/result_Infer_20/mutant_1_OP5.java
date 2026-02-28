import java.util.ArrayList;
import java.util.List;

class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }
        int x = 10;
        for (int i = 0; i < size; i++) {
            x = incr(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(x);
    }

    private static int incr(int x) {
        return x + 1;
    }
}

/* Unreachable switch statement mutant */

class ExpensiveLoopInvariantCallMutant1 {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }
        int x = 10;
        for (int i = 0; i < size; i++) {
            switch (i) {
                case 0:
                    x = incr(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
                    break;
                default:
                    break;
            }
        }
        System.out.println(x);
    }

    private static int incr(int x) {
        return x + 1;
    }
}