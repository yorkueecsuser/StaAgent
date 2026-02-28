// Custom definition for the Expensive annotation
import java.lang.annotation.*;

class ConditionProvider {
    public boolean getFalseCondition() {
        return false;
    }
}

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    @Expensive
    public static void fooLinear(int size) {
        ConditionProvider cp = new ConditionProvider();
        for (int j = 0; cp.getFalseCondition(); j++) {  // Unreachable for loop
            int unused = 0;  // To avoid empty block error
        }

        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}