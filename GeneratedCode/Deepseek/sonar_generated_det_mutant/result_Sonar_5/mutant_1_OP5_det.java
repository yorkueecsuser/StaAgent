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
        int ailjdthy = 0;switch  (ailjdthy) {case 1:char wgoejxsw = 'l';break;default:short qlaperun = 2390;break;}
        enqueue();
    
}
}