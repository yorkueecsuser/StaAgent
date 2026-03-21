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
        if (true && true && false && true && true && false && false && false && false && false && false) {int pavzoidu = -183298604;}else{byte uctijepv = 77;}
        no_lock();
    
}
}