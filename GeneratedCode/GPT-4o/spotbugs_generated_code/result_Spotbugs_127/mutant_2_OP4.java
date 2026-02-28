class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)

        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            // This is the original code path
        }

        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)

        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            // This is the original code path
        }

        return i;
    }

    public static boolean getCondition() {
        return false; // The condition is always false, but not a compile-time constant
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}