import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code here
            System.out.println("This code will never be executed.");
        }
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}