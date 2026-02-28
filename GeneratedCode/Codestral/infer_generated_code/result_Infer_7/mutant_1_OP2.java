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
            lockB.lock(); // Mutant: Duplicate lockB.lock()
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockB.unlock();
                lockB.unlock(); // Mutant: Duplicate lockB.unlock() to match the duplicate lock
            }
        } finally {
            lockA.unlock();
        }
    }

    public void lockBThenA() {
        lockB.lock();
        try {
            lockA.lock();
            lockA.lock(); // Mutant: Duplicate lockA.lock()
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockA.unlock();
                lockA.unlock(); // Mutant: Duplicate lockA.unlock() to match the duplicate lock
            }
        } finally {
            lockB.unlock();
        }
    }

    public void lockAThenAddToVector() {
        lockA.lock();
        try {
            vector.add(object);
            vector.add(object); // Mutant: Duplicate vector.add(object)
        } finally {
            lockA.unlock();
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) {
            lockA.lock();
            lockA.lock(); // Mutant: Duplicate lockA.lock()
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockA.unlock();
                lockA.unlock(); // Mutant: Duplicate lockA.unlock() to match the duplicate lock
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