import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lock = new ReentrantLock();

    // Mutation: Insert unreachable while loop in the "showBug" method
    public void showBug() throws InterruptedException {
        lock.lock();
        boolean condition = false;
        while (condition) {
            lock.wait(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}