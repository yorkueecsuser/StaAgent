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
        
        // Introduced unreachable while loop
        boolean conditionWhile = getCondition(); // This will always return false
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
        
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    // Method to simulate a condition that returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}