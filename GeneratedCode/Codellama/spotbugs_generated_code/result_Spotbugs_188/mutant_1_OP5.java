import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));

        // Unreachable switch statement
        boolean shouldRun = false;
        switch (shouldRun) {
            case true:
                // code
                break;
            case false:
                // code
                break;
            default:
                // code
                break;
        }
    }
}