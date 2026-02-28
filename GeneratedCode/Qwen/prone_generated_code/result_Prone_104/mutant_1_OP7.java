class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return (long) Math.round(longValue); // This line demonstrates the bug
    }

    private boolean getCondition() {
        return false; // This method returns false, but the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}