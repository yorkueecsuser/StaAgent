class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    // Method to provide a false condition for the unreachable if statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        
        // Insert an unreachable if statement
        boolean unreachableCondition = example.getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}