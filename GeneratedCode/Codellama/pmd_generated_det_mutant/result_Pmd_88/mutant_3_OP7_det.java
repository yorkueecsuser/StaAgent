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
        boolean fzagzflg = false;while (fzagzflg && true && false && false && true && false && true && true && false && true && false && false) {int pnskodmy = -352508575;}
        methodWithSynchronizedBlock();
    
}
}