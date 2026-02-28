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
        
        // Inserting an unreachable if statement
        boolean condition = getCondition(); // Use a method to get the condition
        if (condition) {
            System.out.println("This block is unreachable.");
        }
        
        return arr[Math.abs(y % 10)];
    }
    
    // Additional method to provide a non-final condition
    private boolean getCondition() {
        return false; // This makes the if condition always false at runtime
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}