class IncrementOverwriteBug {

    // Method to demonstrate the bug
    public int showBug(int initialValue) {
        int i = initialValue;
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable if-else statement
            i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        } else {
            // This else block is also unreachable due to the condition being dynamically determined
            i = i--;
        }
        return i;
    }

    // Another method to demonstrate the bug with decrement
    public int showBug2(int initialValue) {
        int i = initialValue;
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable if-else statement
            i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        } else {
            // This else block is also unreachable due to the condition being dynamically determined
            i = i++;
        }
        return i;
    }

    // Method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false; // This will always return false, but the compiler does not know this at compile time
    }

    public static void main(String[] args) {
        IncrementOverwriteBug bugDemo = new IncrementOverwriteBug();
        System.out.println("Result of showBug(5): " + bugDemo.showBug(5)); // Expected output: 5
        System.out.println("Result of showBug2(5): " + bugDemo.showBug2(5)); // Expected output: 5
    }
}