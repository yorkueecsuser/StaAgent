import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... ys) {
        System.err.println(Arrays.deepToString(ys));
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]
        Object[] z = flag? new Object[]{1, 2} : new Object[]{3};
        System.err.println(Arrays.toString(z)); // added code to print [1, 2] or [3]
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}