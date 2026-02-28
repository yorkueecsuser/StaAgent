class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Adding an unreachable if statement using a method call for the condition
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable block.");
        }
        return NANOS_PER_DAY;
    }

    // Method to simulate a runtime condition that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}