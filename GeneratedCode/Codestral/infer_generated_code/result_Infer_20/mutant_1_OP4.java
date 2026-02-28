// Custom definition for the Expensive annotation
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    // Method to return the condition for the unreachable if-else branch
    private static boolean getCondition() {
        return false;
    }

    @Expensive
    public static void fooLinear(int size) {
        for (int i = 0; i < size; i++) {
            // Insert unreachable if-else branch
            if (getCondition()) {
                expensiveMethod(); // Unreachable code
            } else {
                incr(size); // Expensive loop-invariant call
            }
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    // Expensive method for the unreachable if-else branch
    private static void expensiveMethod() {
        // Insert expensive operation here
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}