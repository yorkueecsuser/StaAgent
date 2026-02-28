import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lock = new ReentrantLock();

    // Mutant 1: Duplication
    public void showBug() throws InterruptedException {
        lock.lock();
        lock.wait(1000);
        lock.wait(1000); // Duplicated line
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}