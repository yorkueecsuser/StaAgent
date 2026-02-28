import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@interface Pure {}

class InvariantCallBug {
    @Pure
    int foo(int x, int y) {
        return x + y;
    }

    boolean getUnreachableCondition() {
        return false;
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable

            // Mutant code: Unreachable if statement
            if (getUnreachableCondition()) {
                // This block is unreachable
                System.out.println("This line should never be executed.");
            }
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}