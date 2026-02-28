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
    }

    public int[] showBug() {
        Random random = new Random();
        boolean condition = random.nextBoolean();
        int m = condition ? 3 : -5; // Randomly assigns 3 or -5

        // Attempt to allocate array with possible negative size
        if (m > 0) {
            int[] array = new int[m]; // Correct allocation
            return array;
        } else {
            int[] array = new int[m]; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
            return array; // This line may never actually execute due to exception but demonstrates the bug
        }
    }
}