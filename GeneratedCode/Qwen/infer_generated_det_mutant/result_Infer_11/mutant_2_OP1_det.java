import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        int vjziqqdz = 202966682;
        do_lock(); // BUG: LOCKLESS_VIOLATION
    
}

    public void showBug() {
        no_lock();
    }
}