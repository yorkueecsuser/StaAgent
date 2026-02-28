import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This is an unreachable while loop.
            // The condition "unreachableCondition" is always false to make the loop unreachable.
        }
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }

    private boolean getCondition() {
        return false; // Always returns false to ensure the loop is unreachable.
    }
}