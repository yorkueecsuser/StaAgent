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
        boolean shouldRun = getCondition(); // Mutant code - inserted boolean variable to make the if-else branch unreachable.
        for (int i = 0; i < size; i++) {
            if (shouldRun) {
                x = incr(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
            } else {
                x = incr(x); // Unreachable code - the condition of the if-else branch is always false, making this branch unreachable.
            }
        }
        System.out.println(x);
    }

    private static int incr(int x) {
        return x + 1;
    }

    private static boolean getCondition() { // Mutant code - added method to return false, making the if-else branch unreachable.
        return false;
    }
}