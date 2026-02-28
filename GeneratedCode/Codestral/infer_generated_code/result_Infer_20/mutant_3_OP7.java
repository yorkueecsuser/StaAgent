// Custom definition for the Expensive annotation
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    // Method to ensure that the while loop condition is false
    private static boolean getFalseCondition() {
        return false;
    }

    @Expensive
    public static void fooLinear(int size) {
        // Added unreachable while loop
        while (getFalseCondition()) {
            // This code will never execute
            System.out.println("This is an unreachable while loop");
        }

        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}