class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        int bdrrtudf = 0;switch  (bdrrtudf) {case 1:long vbylwwax = -209161670;break;default:double wpodjxty = -245370659;break;}
        // BUG: MathRoundIntLong
        return (long) Math.round(longValue); // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}