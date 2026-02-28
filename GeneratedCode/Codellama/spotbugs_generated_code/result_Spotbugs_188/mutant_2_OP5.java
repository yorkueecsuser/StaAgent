import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));

        // Unreachable switch statement mutant
        switch (getCondition()) {
            case 1: // This case is unreachable because the switch expression is always 0
                System.out.println("This statement is unreachable");
        }
    }

    static boolean getCondition() {
        return false;
    }
}