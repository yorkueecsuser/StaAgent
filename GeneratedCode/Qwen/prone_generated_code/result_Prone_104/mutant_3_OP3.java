class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            intValue += 10;
        }
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            longValue += 10L;
        }
        return (long) Math.round(longValue); // This line demonstrates the bug
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}