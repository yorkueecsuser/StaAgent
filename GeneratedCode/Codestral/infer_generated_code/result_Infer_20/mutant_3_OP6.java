import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    private static boolean getFalseCondition() {
        return false;
    }

    @Expensive
    public static void fooLinear(int size) {
        // Inserted unreachable for loop
        for (int j = 0; getFalseCondition(); j++) {
            System.out.println("Unreachable loop");
        }

        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}