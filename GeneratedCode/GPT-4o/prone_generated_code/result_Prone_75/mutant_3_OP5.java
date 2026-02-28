import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable code block");
                break;
            default:
                break;
        }
    }

    // This method simulates a value that makes the switch statement unreachable
    public static int getUnreachableValue() {
        return 0; // Always returns 0, which has no case and makes the switch body unreachable
    }
}