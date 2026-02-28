import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lock = new ReentrantLock();

    // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    public void showBug() throws InterruptedException {
        lock.lock();
        lock.wait(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}