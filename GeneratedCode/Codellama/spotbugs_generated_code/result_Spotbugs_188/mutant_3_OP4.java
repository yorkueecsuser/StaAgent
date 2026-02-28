import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));
        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Reachable code");
        }
    }
}