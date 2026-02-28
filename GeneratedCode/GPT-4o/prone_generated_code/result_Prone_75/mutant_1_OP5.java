import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        // Introducing a variable to determine the switch expression value
        boolean conditionForSwitch = getCondition();
        
        // Unreachable switch statement with a non-final variable
        switch (conditionForSwitch ? 1 : 0) {
            case 99999:
                System.out.println("This is unreachable because the condition is always false");
                break;
            default:
                break;
        }

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    // Method to simulate dynamic condition evaluation
    private static boolean getCondition() {
        // Always returns false to keep the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}