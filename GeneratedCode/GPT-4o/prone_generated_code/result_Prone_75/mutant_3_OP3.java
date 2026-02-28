import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
        
        // Adding unreachable if statement
        boolean neverRun = getCondition();
        if (neverRun) {
            System.out.println("This will never run");
        }
    }

    // Method to ensure the if condition is never true
    public static boolean getCondition() {
        return false;
    }
}