import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() { // this method should not acquire any locks
        do_lock(); // BUG: LOCKLESS_VIOLATION
        if (getFalseCondition()) {  // Unreachable if statement added here
            System.out.println("This statement is unreachable!");
        }
    }

    public void showBug() {
        no_lock();
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false
    }
}