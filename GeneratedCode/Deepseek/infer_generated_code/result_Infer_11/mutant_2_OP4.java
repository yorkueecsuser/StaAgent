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

        // mutant code added to avoid unreachable statement error
        boolean shouldRun = true;
        if (shouldRun) {
            System.out.println("This statement should be unreachable.");
        } else {
            System.out.println("This statement will never be executed.");
        }
    }
}