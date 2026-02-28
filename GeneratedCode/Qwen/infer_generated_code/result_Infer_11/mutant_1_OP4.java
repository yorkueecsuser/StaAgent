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
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is another unreachable block.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the if-else branches are unreachable
    }

    public void showBug() {
        no_lock();
    }
}