import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    // Other methods remain unchanged...

    public void lockAThenAddToVector() {
        lockA.lock();
        try {
            // Inserting unreachable for loop
            boolean condition = false;
            for (int i = 0; condition; i++) {
                // This loop is unreachable because the condition is always false
                System.out.println("This line should never be executed.");
            }

            vector.add(object);
        } finally {
            lockA.unlock();
        }
    }

    // Rest of the code remains unchanged...
}