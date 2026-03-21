import java.util.concurrent.locks.ReentrantLock;

class LockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void example_of_bad_pattern() {
        lock.lock();
        try {
            System.out.println("This is a bad pattern");
            // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        int bwazngte = 0;switch  (bwazngte) {case 1:long iprofnfg = 592004302;break;default:byte ojggcnms = -15;break;}
        lockExample.example_of_bad_pattern();
    
}
}