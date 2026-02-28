import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION

        // Introduced unreachable while loop according to mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile will always be false at runtime
        }
    }

    public void showBug() {
        no_lock();
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }
}