import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    private static boolean isUnreachable() {
        return false;
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3);

        if (isUnreachable()) {
            System.out.println("This is an unreachable block of code");
        }
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}