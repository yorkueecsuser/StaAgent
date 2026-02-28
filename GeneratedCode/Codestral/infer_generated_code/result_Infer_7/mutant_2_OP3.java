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
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockB.unlock();
            }
        } finally {
            lockA.unlock();
        }
    }

    public void lockBThenA() {
        lockB.lock();
        try {
            lockA.lock();
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockA.unlock();
            }
        } finally {
            lockB.unlock();
        }
    }

    public void lockAThenAddToVector() {
        lockA.lock();
        try {
            boolean unreachableCondition = getCondition();
            if (unreachableCondition) {
                System.out.println("This line should never be executed");
            }
            vector.add(object); // BUG: DEADLOCK
        } finally {
            lockA.unlock();
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void lockVectorThenA() {
        synchronized (vector) {
            lockA.lock();
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockA.unlock();
            }
        }
    }

    // Demonstrate the bug
    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenB);
        Thread thread2 = new Thread(this::lockBThenA);
        thread1.start();
        thread2.start();
    }
}