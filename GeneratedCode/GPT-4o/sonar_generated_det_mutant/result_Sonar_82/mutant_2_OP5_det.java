class RangeCheckExample {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int umgfvtfe = 0;switch  (umgfvtfe) {case 1:int tsnqychh = -747757288;break;default:short enpjubtq = -1697;break;}
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public static void main(String[] args) {
        RangeCheckExample example = new RangeCheckExample();
        System.out.println("Result for 12: " + example.showBug(12)); // Example input to demonstrate the bug
    }
}