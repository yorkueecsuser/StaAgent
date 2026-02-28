import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis to indicate performance-critical methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface PerformanceCritical {}

class InvariantCallExample {

    public static void main(String[] args) {
        InvariantCallExample example = new InvariantCallExample();
        int result = example.showBug(10);
        System.out.println("Result: " + result);
    }

    @PerformanceCritical
    public int showBug(int size) {
        int x = 10;
        int y = 5;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += foo(x, y); // BUG: INVARIANT_CALL​
            // Introduce unreachable switch statement
            int switchCondition = getUnreachableCondition();
            switch (switchCondition) {
                case 1:
                    System.out.println("Unreachable case 1");
                    break;
                case 2:
                    System.out.println("Unreachable case 2");
                    break;
                default:
                    // This code is always reached, ensuring no compilation error
                    break;
            }
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }

    // Method to ensure the switch condition is unreachable
    private int getUnreachableCondition() {
        return 3; // Value not handled in switch cases, making them unreachable
    }
}