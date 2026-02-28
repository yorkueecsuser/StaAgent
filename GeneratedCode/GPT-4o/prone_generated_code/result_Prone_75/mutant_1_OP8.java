import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    // Mutant: Renaming the variable 'flag' to 'f'
    public static String showBugMutant(boolean f) {
        return Arrays.deepToString(f ? new Object[]{1, 2} : new Object[]{3});
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]

        // Testing the mutant method
        System.out.println(showBugMutant(true));  // Expected to print [[1, 2]]
        System.out.println(showBugMutant(false)); // Expected to print [3]
    }
}