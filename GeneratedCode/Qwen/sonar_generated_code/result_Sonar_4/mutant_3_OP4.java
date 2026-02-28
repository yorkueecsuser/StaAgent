import java.lang.Math;

class ClampBugExample {

    // Method to demonstrate the bug in Math.clamp usage
    public int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(value, max, min); // Incorrect range provided

        // Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable block.");
        } else {
            // Alternative block that also will never execute due to the same condition
            System.out.println("This is another unreachable block.");
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ClampBugExample example = new ClampBugExample();
        try {
            int result = example.showBug(10, 5, 15);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}