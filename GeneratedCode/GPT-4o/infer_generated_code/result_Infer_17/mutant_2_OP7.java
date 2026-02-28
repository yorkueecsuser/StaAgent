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

        // Introduce an unreachable while loop
        boolean conditionWhile = getCondition(); // Always returns false
        while (conditionWhile) {
            // This block is unreachable due to the condition
            System.out.println("This is an unreachable while loop.");
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    // A method to simulate dynamic condition evaluation
    private boolean getCondition() {
        return false; // Represents a condition that is always false
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}