// Custom definition for the Expensive annotation
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    @Expensive
    public static void fooLinear(int a) {
        for (int b = 0; b < a; b++) {
            incr(a); // Expensive loop-invariant call
        }
    }

    public static int incr(int c) {
        return c + 1;
    }

    public static void showBug(int d) {
        fooLinear(d);
    }
}