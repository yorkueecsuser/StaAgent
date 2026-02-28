class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Adding unreachable if-else statement
        boolean condition = evaluateCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This part of code is always executed.");
        }

        return NANOS_PER_DAY;
    }

    private boolean evaluateCondition() {
        return false; // This will ensure the if condition is not met, making it unreachable
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}