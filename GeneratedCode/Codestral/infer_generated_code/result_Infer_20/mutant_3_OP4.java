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
            incr(size);

            // Mutated code begins here
            boolean unreachableCondition = isUnreachable();
            if (unreachableCondition) {
                // This code is unreachable
                System.out.println("This line should never be executed.");
            }
            // Mutated code ends here
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }

    // Method to always return false for unreachable condition
    public static boolean isUnreachable() {
        return false;
    }
}