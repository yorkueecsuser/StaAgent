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
        no_lock();
    }

    public void hypotheticalMethod() {
        int x = 5;  // Hypothetical assignment statement
        int x = 5;  // Duplicate of the hypothetical assignment statement
    }
}