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
        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call // BUG: EXPENSIVE_LOOP_INVARIANT_CALL

            // Unreachable switch statement mutant
            if (getFalseCondition()) {
                switch (i) {
                    case 1:
                        // This will never be executed
                        System.out.println("Unreachable code");
                        break;
                }
            }
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }

    // Method that always returns false
    public static boolean getFalseCondition() {
        return false;
    }
}