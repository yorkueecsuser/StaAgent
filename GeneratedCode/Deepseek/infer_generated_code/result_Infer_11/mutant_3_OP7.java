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

    // Unreachable while loop mutation
    {
        boolean condition = true;
        while (condition) {
            // Unreachable code
            System.out.println("This unreachable code will never be executed");
            break;
        }
    }
}