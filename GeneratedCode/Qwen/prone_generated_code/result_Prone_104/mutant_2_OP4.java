class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            intValue += 1;
        } else {
            // Some other unreachable code
            intValue -= 1;
        }
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            longValue += 1;
        } else {
            // Some other unreachable code
            longValue -= 1;
        }
        return (long) Math.round(longValue); // This line demonstrates the bug
    }

    private boolean getCondition() {
        // This method ensures the condition is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}