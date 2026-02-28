import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION

        // Mutant code: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable statement.");
        }
    }

    public void showBug() {
        no_lock();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will ensure the condition is always false at runtime
    }
}