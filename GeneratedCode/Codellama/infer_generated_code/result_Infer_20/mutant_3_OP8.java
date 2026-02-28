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

// Renamed variable in the loop invariant call
class ExpensiveLoopInvariantCallMutant1 {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }
        int y = 10;
        for (int i = 0; i < size; i++) {
            y = incr(y); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(y);
    }

    private static int incr(int y) {
        return y + 1;
    }
}

// Renamed variable in the loop invariant call
class ExpensiveLoopInvariantCallMutant2 {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }
        int z = 10;
        for (int i = 0; i < size; i++) {
            z = incr(z); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(z);
    }

    private static int incr(int z) {
        return z + 1;
    }
}