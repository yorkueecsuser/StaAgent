import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {
    private boolean isInitialized = false;

    public void doSomething() {
        Lock lock = new ReentrantLock();
        lock.lock(); // BUG: Locks should be released on all paths
        if (isInitialized) {
            //...
            lock.unlock();
        }
    }

    public void setInitialized(boolean isInitialized) {
        this.isInitialized = isInitialized;
    }

    public void showBug() {
        doSomething();
    }
}