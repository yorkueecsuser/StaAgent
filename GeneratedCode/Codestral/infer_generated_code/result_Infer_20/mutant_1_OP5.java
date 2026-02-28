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
            incr(size); // Expensive loop-invariant call

            // Unreachable switch statement
            boolean condition = getCondition();
            if (!condition) {
                int value = getValue();
                switch (value) {
                    case 1:
                        // This code is unreachable
                        System.out.println("Unreachable code");
                        break;
                }
            }
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }

    // Helper method to dynamically determine the condition
    private static boolean getCondition() {
        return false;
    }

    // Helper method to dynamically determine the value for the switch statement
    private static int getValue() {
        return 0;
    }
}