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

            // Unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be reached because condition is always false
                    counter += 10;
                    break;
            }
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

            // Unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be reached because condition is always false
                    counter += 20;
                    break;
            }
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

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}