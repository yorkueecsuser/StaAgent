import java.lang.annotation.*;
import java.util.Random;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
@interface ThreadSafe {}

@ThreadSafe
class IntegerOverflowExample {

    public static int getUnknownValue() {
        // Simulate unknown method
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2​
        int[] arr = new int[10];
        
        // Mutation: Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This case is never reached.");
                break;
            case 2:
                // Unreachable code
                System.out.println("Neither is this one.");
                break;
            default:
                // Unreachable code
                System.out.println("Default case is also never reached.");
                break;
        }
        
        return arr[Math.abs(y % 10)];
    }

    // Helper method to ensure the switch is unreachable
    private int getUnreachableValue() {
        return 0;  // Always return 0, which doesn't match any case above
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}