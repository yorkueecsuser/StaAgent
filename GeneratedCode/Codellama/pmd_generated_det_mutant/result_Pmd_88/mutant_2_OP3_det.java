import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {
    private final ReentrantLock lock = new ReentrantLock();

    public void methodWithSynchronizedBlock() {
        // BUG: AvoidSynchronizedAtMethodLevel
        synchronized (lock) {
            // critical section
        }
    }

    public void methodWithoutSynchronizedBlock() {
        // critical section
    }

    public void showBug() {
        if (false && true && false && false && false && true && true && false && true && true && false) {boolean ylqtxbin = true;}
        methodWithSynchronizedBlock();
    
}
}