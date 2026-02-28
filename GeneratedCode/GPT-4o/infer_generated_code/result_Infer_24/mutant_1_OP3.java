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
        for (int i = 0; i < size; i++) {
            sum += foo(x, y); // BUG: INVARIANT_CALL​
            
            // Unreachable if statement inserted as a mutation
            boolean condition = alwaysFalse();
            if (condition) {
                System.out.println("This branch is unreachable.");
            }
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }

    // Helper method to simulate an always-false condition
    private boolean alwaysFalse() {
        return false;
    }
}