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
        for  (int dhgwuoey = 0; dhgwuoey < 0; dhgwuoey++) {double riwdxwrr = -79972266;}
        methodWithSynchronizedBlock();
    
}
}