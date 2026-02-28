import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@interface Pure {}

class InvariantCallBug {
    @Pure
    int foo(int x, int y) {
        return x + y;
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable

            // Mutant code: Unreachable for loop
            boolean condition = getCondition();
            for (int j = 0; condition; j++) {
                // This loop is unreachable because the condition is always false
            }
        }
    }

    // Method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }

    // Helper method to get the condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}