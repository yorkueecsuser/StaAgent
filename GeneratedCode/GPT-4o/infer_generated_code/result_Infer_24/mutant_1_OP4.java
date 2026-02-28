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
        }
        
        // Inserting an unreachable if-else statement
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            // This block is intended to be unreachable
            System.out.println("This is unreachable code.");
        } else {
            // This branch will always execute
            System.out.println("This code runs.");
        }

        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }
    
    // Method to provide a condition for the unreachable if-else statement
    private boolean getUnreachableCondition() {
        return false; // This ensures that the 'if' block is never taken
    }
}