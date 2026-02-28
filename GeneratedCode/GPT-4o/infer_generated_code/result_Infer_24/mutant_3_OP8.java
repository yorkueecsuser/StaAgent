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
        
        // Additional code with renamed variable
        int mutatedResult = example.showBugWithMutation(10);
        System.out.println("Mutated Result: " + mutatedResult);
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

    // Mutated method with renamed variable
    public int showBugWithMutation(int size) {
        int x = 10;
        int z = 5; // Renamed from y to z
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += foo(x, z); // Use of renamed variable
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }
}