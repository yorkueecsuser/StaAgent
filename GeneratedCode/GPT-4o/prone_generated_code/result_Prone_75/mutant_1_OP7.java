import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // This method ensures the condition isn't a compile-time constant
        while (conditionWhile) {
            // This block is unreachable since conditionWhile is always false
            System.out.println("This is unreachable");
        }
        
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    // Helper method to ensure the condition is not a compile-time constant
    private static boolean getCondition() {
        return false; // This is a runtime-evaluated condition
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}