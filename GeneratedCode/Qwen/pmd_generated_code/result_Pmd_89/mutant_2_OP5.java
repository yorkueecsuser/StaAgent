import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynchronizationExample {

    private int counter = 0;

    // Method demonstrating the bug
    public int showBug() {
        // code that doesn't need mutual exclusion
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This switch will never hit case 0
            case 0:
                // Unreachable code
                counter += 10;
                break;
            default:
                // Do nothing
                break;
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
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This switch will never hit case 0
            case 0:
                // Unreachable code
                counter += 10;
                break;
            default:
                // Do nothing
                break;
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

    private boolean getCondition() {
        // This method returns a condition that ensures the switch is unreachable
        return false;
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();
        System.out.println("Using synchronized: " + example.showBug());
        System.out.println("Using Lock: " + example.showPreferred());
    }
}