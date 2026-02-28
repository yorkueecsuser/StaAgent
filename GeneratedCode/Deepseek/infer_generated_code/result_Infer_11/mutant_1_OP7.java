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

    public void unreachableWhileLoopMutant() {
        boolean condition = getUnreachableCondition();
        while (condition) {
            // This loop will never be executed
            // So, it's unreachable
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}