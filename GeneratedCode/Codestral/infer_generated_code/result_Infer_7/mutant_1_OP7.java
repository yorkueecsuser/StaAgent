import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    //... other methods...

    public void lockAThenAddToVector() {
        lockA.lock();
        try {
            boolean conditionWhile = getCondition(); // dynamic condition to avoid compile-time constant
            while (conditionWhile) {
                // This while loop is unreachable because the condition is always false
                // But we add it to demonstrate the mutation operator
            }
            vector.add(object); // BUG: DEADLOCK
        } finally {
            lockA.unlock();
        }
    }

    // Method to return false dynamically
    private boolean getCondition() {
        return false;
    }

    //... other methods...
}