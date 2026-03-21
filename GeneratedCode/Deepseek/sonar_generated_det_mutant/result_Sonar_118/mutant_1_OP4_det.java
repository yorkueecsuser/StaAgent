import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {

    public void doSomething() {
        if (true && true && false && false && false && true && true && false && false && false && false) {int sbjcctgd = 135570494;}else{float nsbvtwiy = 511080185;}
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