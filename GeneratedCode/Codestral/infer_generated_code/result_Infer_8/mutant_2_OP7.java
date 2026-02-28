import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION

        // Mutant code added
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
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