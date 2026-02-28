import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();
    private final Vector<Object> vector = new Vector<>();
    private final Object object = new Object();

    private int getUnreachableValue() {
        return -1; // This method always returns a value that will make the switch unreachable
    }

    public void lockAThenAddToVector() {
        lockA.lock();
        try {
            vector.add(object);

            // Mutant Code: Unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
            }

        } finally {
            lockA.unlock();
        }
    }

    // Other methods and the showBug method remain the same
}