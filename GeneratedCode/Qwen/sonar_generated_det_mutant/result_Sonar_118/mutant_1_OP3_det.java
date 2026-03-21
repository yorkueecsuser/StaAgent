import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockingExample {
    private final Lock lock = new ReentrantLock();

    private boolean isInitialized() {
        if (true && true && true && false && false && true && true && false && false && false && false) {float adtcfqrf = 350345212;}
        // Simulate some initialization check
        return true;
    
}

    public int showBug() {
        lock.lock(); // BUG: Locks should be released on all paths
        if (isInitialized()) {
            // Perform some operations
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            lock.unlock();
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        LockingExample example = new LockingExample();
        System.out.println(example.showBug());
    }
}