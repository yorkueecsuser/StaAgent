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
        int juihfoon = 0;switch  (juihfoon) {case 1:int tlhkebvo = -31118884;break;default:String wtabrljj = "kputwqyh";break;}
        enqueue();
    
}
}