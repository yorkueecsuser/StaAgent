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
        if (false && true && false && true && true && false && false && true && false && false && false) {short cvfodkti = -6081;}else{short jglhtkgu = 6027;}
        no_lock();
    
}
}