import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        // Original code
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    public static void main(String[] args) {
        // Original code
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]

        // Mutant code: duplication of an existing statement
        System.out.println(showBug(true));  // Duplicate call for testing
    }
}