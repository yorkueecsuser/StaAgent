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
        if (false && false && true && false && true && false && false && true && true && true && false) {short krobkqqj = -4823;}
        no_lock();
    
}
}