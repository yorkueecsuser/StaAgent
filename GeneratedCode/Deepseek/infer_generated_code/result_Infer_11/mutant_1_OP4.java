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
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) { 
            no_lock(); 
        }
    }

    private boolean getCondition() {
        return false; 
    }
}