import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static boolean getCondition() {
        return false; // always returns false to make the loop unreachable
    }

    private static void printObjects(Object... xs) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // unreachable for loop
            System.out.println("This line will never be executed.");
        }
        System.err.println(Arrays.deepToString(xs));
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3);
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}