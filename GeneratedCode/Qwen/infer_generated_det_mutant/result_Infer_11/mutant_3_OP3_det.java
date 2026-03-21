import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        if (true && false && true && false && false && true && true && false && true && true && false) {char ldfnaint = 'i';}
        do_lock(); // BUG: LOCKLESS_VIOLATION
    
}

    public void showBug() {
        no_lock();
    }
}