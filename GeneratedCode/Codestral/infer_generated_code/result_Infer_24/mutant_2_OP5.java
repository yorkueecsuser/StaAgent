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

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable
            // Mutant: Unreachable switch statement
            int value = getFalseValue();
            switch (value) {
                case 1:
                    // This code should never execute
                    System.out.println("This is unreachable.");
                    break;
            }
        }
    }

    // Method to simulate the false condition for the switch statement
    boolean getFalseValue() {
        return false;
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}