
class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int sraivvpi = 0;switch  (sraivvpi) {case 1:float jtbgngsv = -10389184;break;default:short rkwnnwzn = -8061;break;}
        int result = Math.min(UPPER, num);
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    
}

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}