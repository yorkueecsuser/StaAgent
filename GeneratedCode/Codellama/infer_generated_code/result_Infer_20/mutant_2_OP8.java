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

// Mutant 1: Renaming variable `x` to `y`
class ExpensiveLoopInvariantCall {
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

    private static int incr(int x) {
        return x + 1;
    }
}

// Mutant 2: Renaming variable `size` to `len`
class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int len = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            numbers.add(i);
        }
        int x = 10;
        for (int i = 0; i < len; i++) {
            x = incr(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(x);
    }

    private static int incr(int x) {
        return x + 1;
    }
}

// Mutant 3: Renaming variable `numbers` to `nums`
class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(i);
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