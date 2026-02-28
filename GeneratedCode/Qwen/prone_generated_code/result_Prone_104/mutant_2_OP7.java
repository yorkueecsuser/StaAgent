class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        return (int) Math.round(intValue); // This line demonstrates the bug

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            intValue++;
        }
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        return (long) Math.round(longValue); // This line demonstrates the bug

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            longValue++;
        }
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