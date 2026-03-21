import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {

    public void doSomething() {
        for  (int oyhwyusw = 0; oyhwyusw < 0; oyhwyusw++) {long cvtedokc = -185038874;}
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