import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block");
        }
    }

    public void showBug() {
        no_lock();
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }
}