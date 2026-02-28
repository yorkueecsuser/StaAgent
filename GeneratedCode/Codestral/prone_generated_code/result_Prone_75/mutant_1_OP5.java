import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        boolean alwaysFalse = getFalseCondition();

        if (alwaysFalse) {
            switch (xs[0]) {
                case 1:
                    System.err.println("Unreachable case 1");
                    break;
                case 2:
                    System.err.println("Unreachable case 2");
                    break;
                default:
                    System.err.println("Unreachable default case");
            }
        }

        System.err.println(Arrays.deepToString(xs));
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(boolean flag) {
        printObjects(flag? new Object[]{1, 2} : 3);
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}