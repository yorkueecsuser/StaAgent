import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis to indicate performance-critical methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface PerformanceCritical {}

class InvariantCallExample {

    public static void main(String[] args) {
        InvariantCallExample example = new InvariantCallExample();
        int result = example.showBug(10);
        System.out.println("Result: " + result);
    }

    @PerformanceCritical
    public int showBug(int size) {
        int x = 10;
        int y = 5;
        int sum = 0;
        boolean conditionWhile = getCondition(); // Non-final variable to ensure it's not a compile-time constant
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false,
            // but it does not result in a compile-time error since the condition is not a constant.
            System.out.println("This is an unreachable code block.");
        }
        for (int i = 0; i < size; i++) {
            sum += foo(x, y); // BUG: INVARIANT_CALL​
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }
    
    private boolean getCondition() {
        return false; // Method returns a non-final boolean value
    }
}