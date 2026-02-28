import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lock = new ReentrantLock();

    public void showBug() throws InterruptedException {
        lock.lock();
        for(; false;) { // Unreachable for loop
            int i = 0; // statement that can't be reached due to the above for loop
        }
        lock.wait(1000);
    }

    private boolean getCondition() { // method to get the condition
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}