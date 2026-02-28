class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Inserting an unreachable for loop as per the mutation operator description
        boolean conditionFor = getCondition(); // dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }

        return NANOS_PER_DAY;
    }

    private boolean getCondition() {
        return false; // condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}