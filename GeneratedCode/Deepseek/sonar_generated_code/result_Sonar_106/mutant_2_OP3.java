import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class BugExample {
    private Lock lock = new ReentrantLock();

    // Mutant code: Using "lock.wait()" instead of "Thread.sleep()"
    public void showBug() throws InterruptedException {
        lock.lock();
        // Mutant Code: "lock.wait()" with a boolean condition that could potentially result in an unreachable code branch
        boolean condition = getCondition();
        if (condition) {
            lock.wait();
        }
        lock.unlock();
    }

    // A method to return a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}