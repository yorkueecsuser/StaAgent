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
            
            // Insert an unreachable switch statement
            int unreachableValue = getUnreachableValue(); // This method returns a value that won't cause any case to execute
            switch (unreachableValue) {
                case 100:
                    System.out.println("This should never print.");
                    break;
                default:
                    // No action needed
                    break;
            }
            
            return array;
        } else {
            int[] array = new int[n]; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
            return array; // This line may never actually execute due to exception but demonstrates the bug
        }
    }
    
    private int getUnreachableValue() {
        return 200; // This value is chosen to not match any case in the unreachable switch
    }
}