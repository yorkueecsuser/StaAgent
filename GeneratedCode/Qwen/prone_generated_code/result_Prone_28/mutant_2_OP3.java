class ConstantOverflowExample {

    // BUG: ConstantOverflow
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block");
        }
        return NANOS_PER_DAY;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY: " + example.showBug());
    }
}