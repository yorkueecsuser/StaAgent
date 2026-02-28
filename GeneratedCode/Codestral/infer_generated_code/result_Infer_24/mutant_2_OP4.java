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
        return false;
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable
            if (getUnreachableCondition()) {
                // unreachable code
                System.out.println("This is an unreachable block of code.");
            } else {
                // alternative code
                System.out.println("This is the alternative code block.");
            }
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}