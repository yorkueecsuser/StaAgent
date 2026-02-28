import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        int example = 5; // Introduced assignment statement for duplication
        int example = 5; // Duplicate of the above assignment statement
        no_lock();
    }
}