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

        // Mutated code
        InvariantCallExample exampleMutation = new InvariantCallExample();
        int resultMutation = exampleMutation.showBugMutation(10);
        System.out.println("Result Mutation: " + resultMutation);
    }

    @PerformanceCritical
    public int showBug(int size) {
        int x = 10;
        int y = 5;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += foo(x, y); // BUG: INVARIANT_CALL​
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }

    // Mutated method
    @PerformanceCritical
    public int showBugMutation(int size) {
        int a = 10; // Renamed x to a
        int y = 5;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += fooMutation(a, y);
        }
        return sum;
    }

    // Mutated method
    private int fooMutation(int a, int y) {
        return a + y; // Updated to use renamed variable a
    }
}