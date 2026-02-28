import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION
        String qvbnrhty = "unused"; // Dead Store mutation
    }

    public void showBug() {
        no_lock();
    }
}