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
        for  (int eoliznvm = 0; eoliznvm < 0; eoliznvm++) {double ufvbdnrb = 158521787;}
        methodWithSynchronizedBlock();
    
}
}