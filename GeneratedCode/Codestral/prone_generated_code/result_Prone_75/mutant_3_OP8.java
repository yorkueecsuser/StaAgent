import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... ys) {  // Renaming xs to ys
        System.err.println(Arrays.deepToString(ys));
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : new Object[]{3}); // Change 3 to new Object[]{3}
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}