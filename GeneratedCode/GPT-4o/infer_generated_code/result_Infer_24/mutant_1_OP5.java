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
        
        // Adding unreachable switch statement as a mutant
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            default:
                break;
        }
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
    
    // Method to ensure dynamic determination of switch condition
    private static int getUnreachableCondition() {
        return 0; // This value ensures the switch case remains unreachable
    }
}