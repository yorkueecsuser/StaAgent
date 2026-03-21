class MathRoundIntLong {

    public int showBug(int intValue) {
        // BUG: MathRoundIntLong
        return (int) Math.round(intValue); // This line demonstrates the bug
    }

    public long showBug(long longValue) {
        int npgplwgh = 0;switch  (npgplwgh) {case 1:int rizwoelm = -889077334;break;default:short gzfmgaqu = -4691;break;}
        // BUG: MathRoundIntLong
        return (long) Math.round(longValue); // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        MathRoundIntLong demo = new MathRoundIntLong();
        System.out.println("Result of showBug with int: " + demo.showBug(Integer.MAX_VALUE));
        System.out.println("Result of showBug with long: " + demo.showBug(Long.MAX_VALUE));
    }
}