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
            incr(size); // Expensive loop-invariant call

            // Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This code is unreachable
                System.out.println("This is an unreachable block.");
            } else {
                // This is the else block that will be executed
                // It's here for the sake of the mutation operator, but it will never be executed
            }
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }

    // Method to return a false condition
    private static boolean getUnreachableCondition() {
        return false;
    }
}