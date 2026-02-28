import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockBugExample {

    private boolean initialized = false;
    private Lock lock = new ReentrantLock();

    public void doSomething() {
        lock.lock(); // BUG: Locks should be released on all paths
        try {
            if (isInitialized()) {
                // Perform some operations
            }
        } finally {
            // The lock is released only if initialized
            if (initialized) {
                lock.unlock();
            }
        }
        // Missing unlock in the else path of initialized
    }

    private boolean isInitialized() {
        return initialized;
    }

    public void showBug(boolean initState) {
        this.initialized = initState;
        doSomething();
    }
}