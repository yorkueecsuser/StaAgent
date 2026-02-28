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

        // Begin of mutant code: Unreachable if statement
        boolean alwaysFalse = getAlwaysFalseCondition();
        if (alwaysFalse) {
            // This block is unreachable
            System.out.println("This will never be printed");
        }
        // End of mutant code

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    // Added method to comply with mutation guidelines
    private boolean getAlwaysFalseCondition() {
        return false; // always returns false
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}