import java.util.Random;

class JavaAllocNegativeSizeExample {

    public static void main(String[] args) {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        int[] bugResult = example.showBug();
        if (bugResult != null) {
            System.out.println("Array size: " + bugResult.length);
        } else {
            System.out.println("Array creation failed.");
        }

        // Unreachable if-else statement added
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable branch executed.");
        }
    }

    public int[] showBug() {
        Random random = new Random();
        boolean condition = random.nextBoolean();
        int n = condition ? 3 : -5; // Randomly assigns 3 or -5

        // Attempt to allocate array with possible negative size
        if (n > 0) {
            int[] array = new int[n]; // Correct allocation
            return array;
        } else {
            int[] array = new int[n]; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
            return array; // This line may never actually execute due to exception but demonstrates the bug
        }
    }

    // Method to ensure unreachable condition is not a compile-time constant
    public static boolean getUnreachableCondition() {
        return false; // Always returns false, making the if branch unreachable
    }
}