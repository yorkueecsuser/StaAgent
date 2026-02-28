import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        }
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if block unreachable
        return false;
    }
}