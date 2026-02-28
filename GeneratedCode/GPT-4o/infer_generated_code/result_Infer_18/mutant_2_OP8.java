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

    // Mutant method with renamed variable
    public int[] showBugMutant() {
        Random rnd = new Random(); // Renamed from 'random' to 'rnd'
        boolean condition = rnd.nextBoolean();
        int n = condition ? 3 : -5; // Randomly assigns 3 or -5

        // Attempt to allocate array with possible negative size
        if (n > 0) {
            int[] arr = new int[n]; // Renamed from 'array' to 'arr'
            return arr;
        } else {
            int[] arr = new int[n]; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
            return arr; // This line may never actually execute due to exception but demonstrates the bug
        }
    }
}