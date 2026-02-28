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
        boolean unreachableCondition = false;
        for (int i = 0; i < size; i++) {
            if (unreachableCondition) {
                // Unreachable if-else statement
                System.out.println("Unreachable code");
            } else {
                foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable
            }
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}