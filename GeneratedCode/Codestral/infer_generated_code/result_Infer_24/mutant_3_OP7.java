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

    boolean getFalseCondition() {
        return false;
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        while (getFalseCondition()) {
            // Unreachable while loop mutant
            System.out.println("This is an unreachable while loop mutant");
        }
        for (int i = 0; i < size; i++) {
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}