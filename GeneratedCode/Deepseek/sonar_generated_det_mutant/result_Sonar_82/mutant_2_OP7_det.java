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
boolean aadyzhyl = false;while (aadyzhyl && true && true && true && true && false && false && false && true && false && false && false) {int sjcypqib = 310963039;}

        return doRangeCheck(12);
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}