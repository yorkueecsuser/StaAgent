class ConstantOverflowExample {

    // BUG: ConstantOverflow
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY: " + example.showBug());

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case to ensure the switch is not empty and compiles successfully
                break;
        }
    }

    private static boolean getCondition() {
        // This method returns false, making the switch statement unreachable
        return false;
    }
}