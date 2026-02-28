import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));
        // Mutated code for Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            ARRAY[1] = 20;
            System.out.println(Arrays.toString(ARRAY));
        } else {
            ARRAY[2] = 30;
            System.out.println(Arrays.toString(ARRAY));
        }
    }

    private static boolean getCondition() {
        // Custom logic to determine the condition
        return true;
    }
}