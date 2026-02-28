class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Introducing a non-final variable to simulate the unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                // This code block is intended to be unreachable
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case which is also unreachable
                System.out.println("Default unreachable switch case.");
                break;
        }
        return NANOS_PER_DAY;
    }

    // Method to simulate an unreachable switch statement
    private int getUnreachableSwitchValue() {
        // Using a method to ensure the control structure condition is dynamically determined at runtime
        return 2; // This value does not match any case in the switch statement
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}