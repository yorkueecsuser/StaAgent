// importing required annotations for demonstrating the bug
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
        return false; // This method always returns false to make the condition unreachable
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            if (getUnreachableCondition()) { // Mutated code: Unreachable if statement
                System.out.println("This line of code should never be reached.");
            }
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}