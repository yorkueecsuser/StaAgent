class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Unreachable if statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        return NANOS_PER_DAY;
    }

    // Method to simulate a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}