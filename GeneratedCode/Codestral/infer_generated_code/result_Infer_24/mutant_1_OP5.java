import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@interface Pure {}

class InvariantCallBug {
    @Pure
    int foo(int x, int y) {
        return x + y;
    }

    boolean alwaysFalse() {
        return false;
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y);
            // Mutant Code: Unreachable switch statement
            if (alwaysFalse()) {
                switch (size) {
                    case 1:
                        // Unreachable code
                        System.out.println("Unreachable code in switch statement");
                        break;
                }
            }
        }
    }

    // method to demonstrate the bug
    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}