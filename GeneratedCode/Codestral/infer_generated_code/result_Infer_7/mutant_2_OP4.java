import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    private boolean getCondition() {
        // This method returns a false value to make the if-else branch unreachable
        return false;
    }

    public void lockAThenB() {
        lockA.lock();
        try {
            lockB.lock();
            try {
                if (getCondition()) {
                    // Unreachable code
                    System.out.println("This line should not be executed.");
                }
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockB.unlock();
            }
        } finally {
            lockA.unlock();
        }
    }

    // Rest of the code remains the same
}