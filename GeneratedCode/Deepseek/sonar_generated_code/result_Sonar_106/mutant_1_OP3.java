import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lock = new ReentrantLock();

    public void showBug() throws InterruptedException {
        lock.lock();
        if (false) {
            lock.wait(1000);
        } else {
            // this branch should never be reached
            System.out.println("This branch should be unreachable");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}