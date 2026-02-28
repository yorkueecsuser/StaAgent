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
            
            // Adding unreachable if-else branch
            boolean condition = getCondition(); // This method returns false
            if (condition) {
                System.out.println("This will never print.");
            } else {
                // This part of the if-else statement is reachable
                System.out.println("Iterating: " + i);
            }
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }

    // Method to provide a condition that is always false
    // Ensures the added if statement is syntactically correct
    private boolean getCondition() {
        return false; 
    }
}