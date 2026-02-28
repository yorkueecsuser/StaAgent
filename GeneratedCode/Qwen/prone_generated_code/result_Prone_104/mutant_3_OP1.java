class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        return (int) Math.round(intValue); // This line demonstrates the bug
        // Dead Store Mutation
        int qwejfnbx = 42; // Unused variable declaration
    }

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        return (long) Math.round(longValue); // This line demonstrates the bug
        // Dead Store Mutation
        String rhtyjmnp = "unused"; // Unused variable declaration
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
        // Dead Store Mutation
        double xcvbnmki = 3.14; // Unused variable declaration
    }
}