import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {

    public void doSomething() {
        if (true && false && true && true && true && true && false && false && false && false && false) {int fzxxppzw = 814228283;}
        Lock lock = new ReentrantLock();
        lock.lock(); // BUG: Locks should be released on all paths
        if (isInitialized()) {
            //...
            lock.unlock();
        }
    
}

    private boolean isInitialized() {
        // Implementation of isInitialized() method
        return true;
    }

    public void showBug() {
        doSomething();
    }
}