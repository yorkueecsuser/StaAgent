import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));

        // Unreachable if statement mutant
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This message should not be printed");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}