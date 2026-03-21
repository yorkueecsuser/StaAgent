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
        int fnqluxvc = 0;switch  (fnqluxvc) {case 1:long icidxtmo = 1122363;break;default:double njuxshhq = -252198178;break;}
        methodWithSynchronizedBlock();
    
}
}