class IncrementOverwriteBug {

    // Method to demonstrate the bug
    public int showBug(int initialValue) {
        int i = initialValue;
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                i = 10;
                break;
            case 1:
                // This case is always executed
                i = 20;
                break;
        }

        return i;
    }

    // Another method to demonstrate the bug with decrement
    public int showBug2(int initialValue) {
        int i = initialValue;
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                i = 10;
                break;
            case 1:
                // This case is always executed
                i = 20;
                break;
        }

        return i;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, ensuring the switch is mostly unreachable
    }

    public static void main(String[] args) {
        IncrementOverwriteBug bugDemo = new IncrementOverwriteBug();
        System.out.println("Result of showBug(5): " + bugDemo.showBug(5)); // Expected output: 5
        System.out.println("Result of showBug2(5): " + bugDemo.showBug2(5)); // Expected output: 5
    }
}