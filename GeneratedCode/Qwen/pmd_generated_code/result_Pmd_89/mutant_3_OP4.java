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
        // Mutant: Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            counter += 10;
        } else {
            // This block also should never execute
            counter -= 5;
        }
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
        // Mutant: Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            counter += 10;
        } else {
            // This block also should never execute
            counter -= 5;
        }
        return counter;
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();
        System.out.println("Using synchronized: " + example.showBug());
        System.out.println("Using Lock: " + example.showPreferred());
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false based on runtime conditions
    }
}