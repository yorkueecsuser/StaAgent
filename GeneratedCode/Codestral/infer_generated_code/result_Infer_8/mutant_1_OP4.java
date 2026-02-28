import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    // Method to simulate an unreachable condition
    private boolean isUnreachableCondition() {
        return false;
    }

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION

        // Unreachable if-else statement
        if (isUnreachableCondition()) {
            // This branch is unreachable
            System.out.println("This line will never be executed");
        } else {
            // Do nothing in the else branch to maintain the original functionality
        }
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}