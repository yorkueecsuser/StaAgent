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

    // Mutated code
    private synchronized void x() {}

    public void y() {
        x(); // BUG: LOCKLESS_VIOLATION
    }

    public void z() {
        y();
    }
}