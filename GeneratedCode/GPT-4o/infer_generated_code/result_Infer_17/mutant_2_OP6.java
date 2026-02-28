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
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2
        int[] arr = new int[10];
        
        // Inserting unreachable for loop as per mutation operator
        boolean conditionFor = getCondition(); // Dynamic condition to avoid unreachable statement errors
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("This is an unreachable for loop.");
        }
        
        return arr[Math.abs(y % 10)];
    }

    // Helper method to simulate dynamic condition
    private static boolean getCondition() {
        return false; // Always returns false, making the loop condition always false at runtime
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}