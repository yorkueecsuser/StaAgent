import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        // Inserting unreachable if-else branch
        boolean unreachableCondition = calculateUnreachableCondition(); // This simulates a runtime evaluation but always returns false.
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            // Original code remains unchanged
            return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
        }
        return ""; // This return is necessary to ensure compilation, though it's logically unreachable.
    }

    // Simulate a condition evaluation that always returns false
    private static boolean calculateUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}