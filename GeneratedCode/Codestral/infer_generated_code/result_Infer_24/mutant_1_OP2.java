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
        // Added mutation: Duplication of assignment statement
        int x_duplicate = x;
        for (int i = 0; i < size; i++) {
            foo(x, y);
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size;
    }
}