import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug(String s) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable
        }
        foo(s);
        System.out.println(f);
    }

    private boolean getCondition() {
        return false;
    }
}