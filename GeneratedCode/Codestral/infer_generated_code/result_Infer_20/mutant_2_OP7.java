// Custom definition for the Expensive annotation
import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    @Expensive
    public static void fooLinear(int size) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop mutant
            int temp = 0; // Added to avoid empty block error
        }
        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}