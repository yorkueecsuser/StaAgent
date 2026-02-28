class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() always returns false
            intValue = intValue + 1;
        } else {
            // Alternative block that will execute
            intValue = intValue - 1;
        }
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() always returns false
            longValue = longValue + 1;
        } else {
            // Alternative block that will execute
            longValue = longValue - 1;
        }
        return (long) Math.round(longValue); // This line demonstrates the bug
    }

    private boolean getCondition() {
        // Always returns false to make the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}