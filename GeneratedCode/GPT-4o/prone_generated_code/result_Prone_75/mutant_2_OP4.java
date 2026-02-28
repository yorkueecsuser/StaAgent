import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        // Unreachable if-else branch added here
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            return "Unreachable code";
        }
        
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    // A method to ensure the condition is not a compile-time constant
    private static boolean getCondition() {
        return false; // Always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}