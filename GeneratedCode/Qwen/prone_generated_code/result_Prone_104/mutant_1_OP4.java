class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is an unreachable block due to the condition always being false
            intValue = intValue + 1;
        } else {
            // This is the reachable block
            return (int) Math.round(intValue);
        }
        return intValue; // This line ensures the method returns something even if the unreachable block is executed
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is an unreachable block due to the condition always being false
            longValue = longValue + 1;
        } else {
            // This is the reachable block
            return (long) Math.round(longValue);
        }
        return longValue; // This line ensures the method returns something even if the unreachable block is executed
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}