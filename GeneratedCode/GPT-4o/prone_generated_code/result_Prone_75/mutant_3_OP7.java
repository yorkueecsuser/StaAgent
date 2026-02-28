import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        boolean unreachableCondition = getCondition(); // Non-final variable to ensure no compile-time constant usage
        while (unreachableCondition) {
            // Unreachable block
            System.out.println("This is unreachable code.");
        }
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }
    
    // Method to provide a false condition for the unreachable while loop
    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}