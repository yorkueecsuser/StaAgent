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
        // Inserting unreachable for loop
        boolean condition = getCondition();
        for (int j = 0; condition; j++) {  // This loop is unreachable because the condition is always false
            System.out.println("This is an unreachable loop");
        }
        for (int i = 0; i < size; i++) {
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable
        }
    }

    // Method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }

    // Method to return always false condition
    private boolean getCondition() {
        return false;
    }
}