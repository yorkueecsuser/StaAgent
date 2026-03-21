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
        int lfdrnhxu = 0;switch  (lfdrnhxu) {case 1:char ckciqfjq = 'y';break;default:float pkvsdbam = 287717780;break;}
        methodWithSynchronizedBlock();
    
}
}