import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lockRenamed = new ReentrantLock();

    // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    public void showBug() throws InterruptedException {
        lockRenamed.lock();
        lockRenamed.wait(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}