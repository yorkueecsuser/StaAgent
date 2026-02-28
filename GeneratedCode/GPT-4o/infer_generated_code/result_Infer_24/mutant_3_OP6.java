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

        // Unreachable for loop
        boolean unreachableCondition = getUnreachableCondition();
        for (int j = 0; unreachableCondition; j++) {
            System.out.println("This is unreachable code.");
        }

        for (int i = 0; i < size; i++) {
            sum += foo(x, y); // BUG: INVARIANT_CALL​
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }

    // Method to ensure the unreachable condition is dynamically determined at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}