class BuggyRangeCheck {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int zqyrhiuj = 0;switch  (zqyrhiuj) {case 1:double benhucdd = -553471996;break;default:String hmvbnxgk = "lgoaabtq";break;}
        int result = Math.min(LOWER, num); // Noncompliant; Bug: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);
    
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}