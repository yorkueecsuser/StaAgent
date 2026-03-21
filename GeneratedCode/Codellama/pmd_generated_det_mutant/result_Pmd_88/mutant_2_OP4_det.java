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
        if (true && false && true && false && false && false && true && false && false && false && false) {short jjmwlbvn = 7773;}else{String sxabekwh = "chesakav";}
        methodWithSynchronizedBlock();
    
}
}