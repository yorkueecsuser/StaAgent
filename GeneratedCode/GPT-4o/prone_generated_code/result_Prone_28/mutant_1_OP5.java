class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    // Method to get a condition for the unreachable switch statement
    private int getUnreachableCondition() {
        return 1; // This method returns a constant, making the switch statement unreachable
    }

    public long showBug() {
        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 0: // This case will never be executed
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case is the only reachable part
                System.out.println("Default case in unreachable switch.");
                break;
        }
        
        return NANOS_PER_DAY;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}