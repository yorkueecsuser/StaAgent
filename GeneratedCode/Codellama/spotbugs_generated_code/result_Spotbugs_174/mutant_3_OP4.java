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

        // Unreachable if-else statement mutant
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code inside this branch is unreachable
            System.out.println("This code is unreachable");
        } else {
            // Code inside this branch is reachable
        }
    }
}