import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    // Mutant: Renaming user-defined variables
    public static String showBugWithMutation(boolean x) {
        return Arrays.deepToString(x ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
        
        // Testing the mutant method
        System.out.println(showBugWithMutation(true));  // Expected to print [[1, 2]]
        System.out.println(showBugWithMutation(false)); // Expected to print [3]
    }
}