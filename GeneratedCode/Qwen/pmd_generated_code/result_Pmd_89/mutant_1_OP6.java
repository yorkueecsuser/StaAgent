import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynchronizationExample {

    private int counter = 0;

    // Method demonstrating the bug
    public int showBug() {
        // code that doesn't need mutual exclusion
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop will never execute because conditionFor is always false
        }
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop will never execute because conditionFor is always false
        }
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

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();
        System.out.println("Using synchronized: " + example.showBug());
        System.out.println("Using Lock: " + example.showPreferred());
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the for loop unreachable
    }
}