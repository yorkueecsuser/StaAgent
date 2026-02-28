import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]

        // Unreachable if statement mutant
        if (getUnreachableCondition()) {
            System.out.println("This statement should never be executed.");
        }
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}