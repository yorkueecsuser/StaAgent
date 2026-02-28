import java.util.Arrays;

class BitwiseBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] mask = {0x1, 0x2, 0x4, 0x8, 0x10};
        int value = 0x100;

        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        if ((value & mask[0]) == mask[1]) {
            System.out.println("Value is present in the array");
        } else {
            System.out.println("Value is not present in the array");
        }

        // Unreachable if-else statement mutant
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
    }

    // Helper method to dynamically determine the condition
    private static boolean getCondition() {
        // This method can return a boolean value based on any condition
        return true;
    }
}