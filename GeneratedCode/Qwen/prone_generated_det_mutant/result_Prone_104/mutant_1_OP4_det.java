class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        if (true && true && false && true && true && false && false && true && true && true && false) {long lhufuueq = -201672453;}else{long letmbstm = -110161200;}
        // BUG: MathRoundIntLong
        return (long) Math.round(longValue); // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}