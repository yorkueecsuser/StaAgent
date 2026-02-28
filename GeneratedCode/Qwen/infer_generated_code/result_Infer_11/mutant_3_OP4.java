import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION

        // Mutant code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true.");
        } else {
            // This branch is unreachable because shouldRun is always false in this context
            System.out.println("This will never run.");
        }
    }

    public void showBug() {
        no_lock();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the else branch is unreachable
    }
}