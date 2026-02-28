import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynchronizationExample {

    private int counter = 0;

    // Method demonstrating the bug
    public int showBug() {
        // code that doesn't need mutual exclusion
        synchronized (this) { // BUG: AvoidSynchronizedStatement
            // code that requires mutual exclusion
            counter++;
        }
        // more code that doesn't need mutual exclusion
        return counter;
    }

    // Prefer this:
    private Lock instanceLock = new ReentrantLock();

    public int showPreferred() {
        // code that doesn't need mutual exclusion
        try {
            instanceLock.lock();  // or instanceLock.tryLock(long time, TimeUnit unit)
            // code that requires mutual exclusion
            counter++;
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
        return counter;
    }

    // Mutated code with renaming operator
    private Lock a = new ReentrantLock();

    public int showMutated() {
        // code that doesn't need mutual exclusion
        try {
            a.lock();  // or a.tryLock(long time, TimeUnit unit)
            // code that requires mutual exclusion
            counter++;
        } finally {
            a.unlock();
        }
        // more code that doesn't need mutual exclusion
        return counter;
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();
        System.out.println("Using synchronized: " + example.showBug());
        System.out.println("Using Lock: " + example.showPreferred());
        System.out.println("Using mutated Lock: " + example.showMutated());
    }
}