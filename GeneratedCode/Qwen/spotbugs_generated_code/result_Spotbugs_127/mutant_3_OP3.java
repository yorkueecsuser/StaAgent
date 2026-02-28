class IncrementOverwriteBug {

    // Method to demonstrate the bug
    public int showBug(int initialValue) {
        int i = initialValue;
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            i = 10; // This line is unreachable
        }
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    // Another method to demonstrate the bug with decrement
    public int showBug2(int initialValue) {
        int i = initialValue;
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            i = 10; // This line is unreachable
        }
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    // Method to provide a dynamic condition for the if statement
    private boolean getCondition() {
        return false; // This method returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        IncrementOverwriteBug bugDemo = new IncrementOverwriteBug();
        System.out.println("Result of showBug(5): " + bugDemo.showBug(5)); // Expected output: 5
        System.out.println("Result of showBug2(5): " + bugDemo.showBug2(5)); // Expected output: 5
    }
}