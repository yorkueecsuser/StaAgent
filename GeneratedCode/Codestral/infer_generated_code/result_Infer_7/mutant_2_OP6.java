import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    // Added unreachable for loop here
    private boolean getUnreachableCondition() {
        return false;
    }

    public void lockAThenAddToVector() {
        lockA.lock();
        try {
            for (int i = 0; getUnreachableCondition(); i++) {
                // Unreachable code
                System.out.println("This line should never print");
            }
            vector.add(object);
        } finally {
            lockA.unlock();
        }
    }

    // Rest of the code remains the same
    //...
}