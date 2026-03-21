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
        boolean hpdluxfd = false;while (hpdluxfd && true && false && false && true && true && true && true && true && true && false && false) {boolean srrehkcv = true;}
        methodWithSynchronizedBlock();
    
}
}