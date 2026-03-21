class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        boolean ruxeqrdv = false;while (ruxeqrdv && false && false && true && false && true && true && false && false && true && true && false) {double gcfbnejo = -443911391;}
        // BUG: MathRoundIntLong
        return (long) Math.round(longValue); // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}