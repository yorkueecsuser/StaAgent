import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() { // this method should not acquire any locks
        do_lock(); // BUG: LOCKLESS_VIOLATION
        addMutantCode(); // Unreachable switch statement
    }

    public void showBug() {
        no_lock();
    }

    private void addMutantCode() {
        int value = 0; // non-final variable
        switch(value) {
            case 1:
                // unreachable code
                break;
        }
    }
}