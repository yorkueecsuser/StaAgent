import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        boolean cbelzjkl = false;while (cbelzjkl && true && false && false && true && true && true && false && true && false && false && false) {byte tejblnaq = -112;}
        do_lock(); // BUG: LOCKLESS_VIOLATION
    
}

    public void showBug() {
        no_lock();
    }
}