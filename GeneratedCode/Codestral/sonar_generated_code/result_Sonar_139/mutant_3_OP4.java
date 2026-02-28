class DoubleBug {
    public double showBug(int value) {
        // Original code
        double originalValue = Double.longBitsToDouble(value);

        // Mutant code: Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if(condition) {
            // This block is unreachable
            System.out.println("Unreachable block");
            return -1.0;
        } else {
            // This block is always executed
            return originalValue;
        }
    }

    // Method that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}