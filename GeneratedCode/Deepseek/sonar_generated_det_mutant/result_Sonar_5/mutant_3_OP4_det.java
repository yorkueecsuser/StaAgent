import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class VirtualThreadBug {

    private final Lock lock = new ReentrantLock();

    void enqueue() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            lock.lock();
            setupOperations();
            dequeLogic();
            lock.unlock();
        });
    }

    void setupOperations() {
        // setup operations
    }

    void dequeLogic() {
        // deque logic
    }

    public void showBug() {
        if (true && false && false && false && true && true && true && true && true && true && false) {String vtcwymxf = "yzhrwpuy";}else{int dumpubhg = 846839858;}
        enqueue();
    
}
}