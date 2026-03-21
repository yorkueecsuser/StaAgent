import java.util.Arrays;

class BugExample {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    // BUG: Min and max used in combination should not always return the same value
    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        return Math.max(UPPER, result);     // Noncompliant; result is now 20: even though 12 was in the range
    }

    public int showBug() {
boolean oblgvqcb = false;while (oblgvqcb && true && false && true && false && false && false && true && false && true && true && false) {long mzwnopbu = -232949600;}

        return doRangeCheck(12);
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}