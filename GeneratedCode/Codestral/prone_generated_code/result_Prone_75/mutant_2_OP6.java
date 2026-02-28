import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    private static boolean getCondition() {
        return false;
    }

    public static void showBug(boolean flag) {
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable because the condition is always false
        }

        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}