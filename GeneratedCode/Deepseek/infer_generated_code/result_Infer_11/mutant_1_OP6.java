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
        no_lock();
    }

    private boolean getCondition() {
        return false;
    }

    public void insertUnreachableForLoop() {
        for (boolean condition = getCondition(); condition; condition = getCondition()) {
            // This for loop should be unreachable as condition never changes
        }
    }
}