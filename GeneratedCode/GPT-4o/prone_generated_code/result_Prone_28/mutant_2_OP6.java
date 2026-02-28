class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Introduce unreachable for loop
        boolean reachabilityCondition = getFalseCondition();
        for (int i = 0; reachabilityCondition; i++) {
            System.out.println("This loop is unreachable.");
        }
        
        return NANOS_PER_DAY;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
    
    // Method to determine false condition dynamically at runtime
    private boolean getFalseCondition() {
        return false;
    }
}