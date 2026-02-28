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

    private boolean unreachableLoopCondition = false;
    private boolean getCondition() {
        return unreachableLoopCondition;
    }

    public void addUnreachableWhileLoop() {
        while (getCondition()) {
            // unreachable code
        }
    }
}