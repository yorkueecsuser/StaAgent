import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyClass {
    private Lock lock = new ReentrantLock();
    private boolean initialized = false;

    public void initialize() {
        initialized = true;
    }

    public void doSomething() {
        lock.lock();
        if (initialized) {
            //...
            lock.unlock(); // Noncompliant: Locks should be released on all paths
        }
        // BUG: Locks should be released on all paths
    }

    public void showBug() {
        doSomething();
    }
}