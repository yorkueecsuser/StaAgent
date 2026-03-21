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
        if (false && true && true && false && false && true && false && false && true && true && false) {int ltsfkzji = 762310595;}else{short ufhdljqn = -8444;}
        methodWithSynchronizedBlock();
    
}
}