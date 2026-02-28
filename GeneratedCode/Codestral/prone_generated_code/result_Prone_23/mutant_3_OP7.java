class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        }

        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }

    private boolean getUnreachableCondition() {
        return false; // This makes the while loop unreachable
    }
}