import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    private static boolean getUnreachableCondition() {
        // This method will always return false, making the switch statement unreachable
        return false;
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3);

        // Inserted unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                System.out.println("This line will never be executed.");
                break;
        }
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}