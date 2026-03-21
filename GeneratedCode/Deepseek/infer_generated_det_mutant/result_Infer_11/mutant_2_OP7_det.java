import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() { // this method should not acquire any locks
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        boolean wafbzjct = false;while (wafbzjct && true && false && false && true && true && true && false && false && true && false && false) {byte wwqddwfu = -111;}
        no_lock();
    
}
}