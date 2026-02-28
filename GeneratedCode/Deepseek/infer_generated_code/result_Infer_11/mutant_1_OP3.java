import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private boolean locklessCondition = true;

    private synchronized void do_lock() {}

    public void no_lock() { // this method should not acquire any locks
        if (!locklessCondition) {
            do_lock(); // BUG: LOCKLESS_VIOLATION
        }
    }

    public void showBug() {
        no_lock();
    }
}