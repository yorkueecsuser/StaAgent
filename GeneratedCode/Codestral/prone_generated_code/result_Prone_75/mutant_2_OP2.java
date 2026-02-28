import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public static void showBug(boolean flag) {
        Object[] objects = flag? new Object[]{1, 2} : new Object[]{3}; // Duplicate the assignment
        printObjects(objects);
        // Added duplicate assignment
        printObjects(objects);
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}