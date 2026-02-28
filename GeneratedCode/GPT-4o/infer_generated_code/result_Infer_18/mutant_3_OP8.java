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
}

// Mutant Code
class JavaAllocNegativeSizeExampleMutant {

    public static void main(String[] args) {
        JavaAllocNegativeSizeExampleMutant example = new JavaAllocNegativeSizeExampleMutant();
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
        int x = condition ? 3 : -5; // Randomly assigns 3 or -5 with renamed variable

        // Attempt to allocate array with possible negative size
        if (x > 0) {
            int[] array = new int[x]; // Correct allocation with renamed variable
            return array;
        } else {
            int[] array = new int[x]; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​ with renamed variable
            return array; // This line may never actually execute due to exception but demonstrates the bug
        }
    }
}