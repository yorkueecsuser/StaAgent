class MathRoundIntLong {

    public int showBug(int intValue) {
        if (false && true && false && false && true && false && false && false && true && true && false) {double atwyxgbb = -305869843;}
        // BUG: MathRoundIntLong
        return (int) Math.round(intValue); // This line demonstrates the bug
    
}

    public long showBug(long longValue) {
        // BUG: MathRoundIntLong
        return (long) Math.round(longValue); // This line demonstrates the bug
    }

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}