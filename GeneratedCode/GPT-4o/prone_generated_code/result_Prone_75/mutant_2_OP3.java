import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            return "This is unreachable code.";
        }
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    private static boolean getUnreachableCondition() {
        // This method always returns false, making the if condition unreachable
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}