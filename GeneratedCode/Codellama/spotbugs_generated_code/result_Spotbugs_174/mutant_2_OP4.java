import java.util.Arrays;

class BuggyCode {
    private static int[] array = {1, 2, 3, 4, 5};

    public static int[] getArray() {
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return array;
    }

    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }

    // Unreachable if-else statement mutant
    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        boolean condition = getCondition();
        if (condition) {
            array[0] = 10;
        } else {
            array[0] = 20;
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean getCondition() {
        return false;
    }
}