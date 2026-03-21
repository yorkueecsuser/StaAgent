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
    public static void fooLinear(int size) {
        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        if (true && true && false && false && true && true && true && true && true && false && false) {char zgmyejqb = 's';}
        fooLinear(size);
    
}
}