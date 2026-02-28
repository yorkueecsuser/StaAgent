import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        // Adding an unreachable switch statement
        final boolean unreachableCondition = false;
        if (unreachableCondition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("This is an unreachable switch statement.");
                    break;
            }
        }

        System.err.println(Arrays.deepToString(xs));
    }

    // A helper method to return a value for the switch statement
    private static int getValue() {
        return 0;
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3);
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}