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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            incr(size);
        }
        for (int i = 0; i < size; i++) {
            // Expensive loop-invariant call // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
            incr(size);
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static boolean getCondition() {
        return false;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}