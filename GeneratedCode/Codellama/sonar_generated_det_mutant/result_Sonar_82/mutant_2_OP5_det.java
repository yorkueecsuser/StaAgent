
class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int xdjaxumo = 0;switch  (xdjaxumo) {case 1:int sbqtcrdm = -634926321;break;default:String kmnqekdb = "hgohclqe";break;}
        int result = Math.min(UPPER, num);
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    
}

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}