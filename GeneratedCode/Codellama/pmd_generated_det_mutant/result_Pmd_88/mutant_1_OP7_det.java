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
        boolean aweevdgf = false;while (aweevdgf && true && false && false && true && true && false && true && false && true && true && false) {String jkbokdho = "deowsocn";}
        methodWithSynchronizedBlock();
    
}
}