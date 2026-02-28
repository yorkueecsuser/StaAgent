import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]

        // Inserting unreachable if-else branch
        if (getFalseCondition()) {
            System.out.println("This branch is unreachable and only added for mutation testing.");
        } else {
            // This else branch is also unreachable.
        }
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}