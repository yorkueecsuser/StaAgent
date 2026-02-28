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

    private int getUnreachableValue() {
        return 0;
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // Bug: INVARIANT_CALL - this function call is loop-invariant and hoistable

            // Added unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    // This code will never execute
                    System.out.println("This is unreachable code");
                    break;
            }
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}