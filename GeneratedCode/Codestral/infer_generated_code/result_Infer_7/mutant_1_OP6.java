import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    public void lockAThenB() {
        lockA.lock();
        try {
            lockB.lock();
            try {
                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) { /* Unreachable code */ }
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockB.unlock();
            }
        } finally {
            lockA.unlock();
        }
    }

    // Rest of the code remains the same...

    // Dummy method to return a false condition
    private boolean getCondition() {
        return false;
    }
}