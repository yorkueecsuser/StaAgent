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
        int wlmihisoinkcgkz = 10;
        int oinkcgkz = 5;
        for (int i = 0; i < size; i++) {
            foo(wlmihisoinkcgkz, oinkcgkz); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}