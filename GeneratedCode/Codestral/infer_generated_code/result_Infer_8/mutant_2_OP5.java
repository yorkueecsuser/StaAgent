import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION

        // Mutant code: inserting unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            // This switch statement is unreachable as the condition is always false
            switch (0) {
                case 1: // code that will never execute
                    System.out.println("This is an unreachable statement");
                    break;
            }
        }
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }

    // Method to simulate dynamic condition evaluation
    private boolean getCondition() {
        return false; // Always returns false for the unreachable switch statement
    }
}