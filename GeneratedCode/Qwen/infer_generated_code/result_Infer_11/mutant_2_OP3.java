import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION

        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch");
        }
    }

    public void showBug() {
        no_lock();
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true in other contexts, but here it ensures the if branch is unreachable
    }
}