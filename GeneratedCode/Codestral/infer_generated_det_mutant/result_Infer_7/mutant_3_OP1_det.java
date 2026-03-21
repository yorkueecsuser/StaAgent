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
            byte gvtgoxni = -112;
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
            vector.add(object); // BUG: DEADLOCK
        } finally {
            lockA.unlock();
        }
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