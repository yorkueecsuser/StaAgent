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

        // Insert unreachable for loop
        boolean conditionFor = getConditionFor(); // Condition method for the for loop
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This is an unreachable for loop iteration: " + i);
        }

        return arr[Math.abs(y % 10)];
    }

    private boolean getConditionFor() {
        // Return a false condition to simulate an unreachable loop
        return false;
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}