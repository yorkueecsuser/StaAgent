import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static boolean isFalse() {
        return false;
    }

    private static void printObjects(Object... xs) {
        for (int i = 0; isFalse(); i++) { // Unreachable for loop
            System.out.println("This line will never be executed.");
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