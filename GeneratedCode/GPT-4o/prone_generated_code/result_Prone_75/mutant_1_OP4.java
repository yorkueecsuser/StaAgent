import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        // Unreachable if-else statement added
        boolean condition = getCondition(); // A method to get a runtime condition
        if (condition) {
            // This block is never executed
            System.out.println("This will never print.");
        } else {
            System.out.println("This is an unreachable else branch.");
        }

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    // Method to simulate runtime condition, always returns false
    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}