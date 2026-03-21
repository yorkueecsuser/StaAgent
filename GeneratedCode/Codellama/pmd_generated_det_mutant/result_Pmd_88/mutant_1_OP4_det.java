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
        if (false && false && false && true && false && false && true && false && true && true && false) {boolean mobcmdxm = true;}else{char vqgwwjtk = 'w';}
        methodWithSynchronizedBlock();
    
}
}