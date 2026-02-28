import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
        // Adding an unreachable for loop as per mutation guidelines
        boolean conditionFor = getCondition(); // Method to ensure condition is not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to conditionFor being false.
            System.out.println("Unreachable code");
        }

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    }

    // Helper method to simulate a runtime condition
    private static boolean getCondition() {
        return false; // Ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}