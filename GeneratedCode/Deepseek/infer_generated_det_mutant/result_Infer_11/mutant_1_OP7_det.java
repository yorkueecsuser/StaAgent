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
        boolean txfulydc = false;while (txfulydc && true && true && true && true && false && true && true && true && true && false && false) {double odouuryi = 343956915;}
        no_lock();
    
}
}