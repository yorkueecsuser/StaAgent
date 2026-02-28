class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // This method dynamically determines the condition at runtime
        while (conditionWhile) {
            // This block will never execute because conditionWhile is false
            System.out.println("This is an unreachable while loop.");
        }
        return NANOS_PER_DAY;
    }

    private boolean getCondition() {
        // The method returns false to ensure the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}