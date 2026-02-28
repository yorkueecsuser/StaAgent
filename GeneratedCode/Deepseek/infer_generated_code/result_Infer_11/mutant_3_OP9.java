import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() { 
        if(true) {
            do {
                do_lock();
            } while (false);
        }
        // this method should not acquire any locks
        // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        no_lock();
    }
}