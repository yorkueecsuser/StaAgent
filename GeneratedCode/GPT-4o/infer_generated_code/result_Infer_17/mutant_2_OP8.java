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
        int x = getUnknownValue(); // Original variable
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2​
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    // Mutant code with variable renaming
    public int showBugMutant() {
        int a = getUnknownValue(); // Renamed variable x to a
        int y = a + 2000000000; // Reuse of renamed variable a
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
        System.out.println(obj.showBugMutant()); // Call to mutant method
    }
}