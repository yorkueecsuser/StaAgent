import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));

        // Mutant 1: Insert unreachable while loop into a randomly selected basic block in the program.
        // The condition of the inserted loop is always false to make it unreachable.
        while (false) {
            // code
        }
    }
}