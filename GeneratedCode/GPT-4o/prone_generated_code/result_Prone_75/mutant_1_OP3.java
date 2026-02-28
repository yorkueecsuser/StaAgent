import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
        
        // Inserting an unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    // Method to ensure the condition is always false at runtime
    private static boolean getFalseCondition() {
        return false;
    }
}