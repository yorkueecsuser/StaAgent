import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static boolean getCondition() {
        return false;
    }

    private static void printObjects(Object... xs) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            // But we need to include it to satisfy the mutation operator
        }
        System.err.println(Arrays.deepToString(xs));
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}