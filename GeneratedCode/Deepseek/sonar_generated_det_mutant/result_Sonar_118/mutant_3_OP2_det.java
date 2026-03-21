import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {
public void doSomething() {
    Lock lock = new ReentrantLock();
    lock = new ReentrantLock();
    lock.lock();
    if(isInitialized()){ lock.unlock(); }
}

    private boolean isInitialized() {
        // Implementation of isInitialized() method
        return true;
    }

    public void showBug() {
        doSomething();
    }
}