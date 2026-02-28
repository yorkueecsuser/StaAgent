class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        int roundedIntValue = (int) Math.round(intValue); // This line demonstrates the bug
        int roundedIntValueCopy = roundedIntValue; // Duplicate assignment
        return roundedIntValue;
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        long roundedLongValue = (long) Math.round(longValue); // This line demonstrates the bug
        long roundedLongValueCopy = roundedLongValue; // Duplicate assignment
        return roundedLongValue;
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}