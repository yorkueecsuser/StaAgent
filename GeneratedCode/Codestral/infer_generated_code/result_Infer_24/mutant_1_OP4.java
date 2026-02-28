import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@interface Pure {}

class InvariantCallBug {
    @Pure
    int foo(int x, int y) {
        return x + y;
    }

    // New method with an unreachable if-else statement
    void unreachableIfElse(int size) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This line will never be executed, it's an unreachable branch
            System.out.println("This is unreachable");
        } else {
            // This is the reachable branch
            invariant_hoist(size);
        }
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y);
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        unreachableIfElse(size);
        return size;
    }
}