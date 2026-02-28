class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        int a = intValue; // Renamed variable
        return (int) Math.round(a); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        long b = longValue; // Renamed variable
        return (long) Math.round(b); // This line demonstrates the bug
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}