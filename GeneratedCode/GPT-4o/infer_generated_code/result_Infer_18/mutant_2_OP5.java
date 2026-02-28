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
            
            // Unreachable switch statement
            int unreachableCondition = getConditionValue(); // always returns a value not matching any case
            switch (unreachableCondition) {
                case 10: // This will never be reached
                    System.out.println("This is unreachable code.");
                    break;
                default:
                    break;
            }
            
            return array;
        } else {
            int[] array = new int[n]; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
            return array; // This line may never actually execute due to exception but demonstrates the bug
        }
    }
    
    // Method to provide a value that doesn't match any switch case
    public int getConditionValue() {
        return 0; // Provides a value ensuring the switch case remains unreachable
    }
}