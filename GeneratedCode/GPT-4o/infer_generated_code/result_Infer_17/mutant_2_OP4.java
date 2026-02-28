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

    // Helper method to simulate a false condition without a compile-time constant
    private boolean getCondition() {
        return new Random().nextBoolean() && false; // This effectively simulates a false condition
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2​
        int[] arr = new int[10];

        // Inserting an unreachable if-else statement
        if (getCondition()) {
            System.out.println("This branch is unreachable.");
        } else {
            // Even though the else branch will always execute, it doesn't affect the original logic
            System.out.println("This is the always executed branch.");
        }

        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}