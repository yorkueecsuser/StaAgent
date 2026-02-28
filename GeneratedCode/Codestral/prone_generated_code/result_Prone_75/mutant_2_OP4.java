import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        if (xs.length > 0) {
            System.err.println(Arrays.deepToString(xs));
        }
        else {
            // Unreachable if-else branch
            boolean isFalse = false;
            if (isFalse) {
                System.err.println("This line should never be reached.");
            }
        }
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}