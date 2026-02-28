import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lock = new ReentrantLock();

    // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    public void showBug() throws InterruptedException {
        lock.lock();
        lock.wait(1000);
        
        // Added mutant code: Unreachable switch statement
        boolean unreachableCondition = getCondition();
        switch (unreachableCondition) {
            case false:
                break;
            default:
                break;
        }
    }

    // Dummy method to return a boolean condition
    public boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}