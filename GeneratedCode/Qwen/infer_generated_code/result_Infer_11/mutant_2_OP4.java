import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is reachable code.");
        } else {
            // This branch is unreachable because getCondition() always returns true
            System.out.println("This is unreachable code.");
        }
    }

    public void showBug() {
        no_lock();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true;
    }
}