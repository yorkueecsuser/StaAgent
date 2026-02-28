class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop is unreachable because the condition is always false
            System.out.println("Unreachable code executed!");
        }
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }
}