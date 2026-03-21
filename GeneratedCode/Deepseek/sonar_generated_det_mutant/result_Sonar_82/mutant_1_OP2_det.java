import java.util.Arrays;

class BugExample {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    // BUG: Min and max used in combination should not always return the same value
public int doRangeCheck(int num){
    int result = Math.min(LOWER , num);
    result = Math.min(LOWER , num);
    return Math.max(UPPER , result);
}

    public int showBug() {
        return doRangeCheck(12);
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}