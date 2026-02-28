import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    // Additional method to return a dynamically determined false condition
    private boolean getFalseCondition() {
        return false;
    }

    public void lockAThenB() {
        lockA.lock();
        try {
            lockB.lock();
            try {
                // Unreachable if-else statement
                if (getFalseCondition()) {
                    // This code will never be executed
                } else {
                    // do something with both resources // BUG: DEADLOCK
                }
            } finally {
                lockB.unlock();
            }
        } finally {
            lockA.unlock();
        }
    }

    // Rest of the code remains the same
    //...
}