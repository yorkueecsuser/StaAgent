class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
        
        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is never executed.");
        } else {
            System.out.println("This block is always executed.");
        }
    }

    // A method to simulate a dynamic condition
    public static boolean getCondition() {
        return false;
    }
}