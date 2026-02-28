import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void lock() {}

    public void no_lock() { // this method should not acquire any locks
        lock(); // Mutant: this mutant introduces a bug where a lockless method calls a lock method
    }

    public void showBug() {
        no_lock();
    }
}