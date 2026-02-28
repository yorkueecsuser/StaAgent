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

        // Introducing unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case -1:
                System.out.println("This case is never executed.");
                break;
            default:
                break;
        }

        return arr[Math.abs(y % 10)];
    }

    // Method to simulate a condition for unreachable switch
    private int getUnreachableValue() {
        return 2; // Always returning a value not matched in the switch
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}