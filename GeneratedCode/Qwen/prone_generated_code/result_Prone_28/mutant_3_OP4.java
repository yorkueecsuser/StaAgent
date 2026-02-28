class ConstantOverflowExample {

    // BUG: ConstantOverflow
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block");
        } else {
            // Alternative code
            System.out.println("This is the alternative block");
        }
        return NANOS_PER_DAY;
    }

    private boolean getCondition() {
        // This method returns false, making the 'if' block unreachable
        return false;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY: " + example.showBug());
    }
}