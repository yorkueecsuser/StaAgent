import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final Lock lockC = new ReentrantLock();
    private final Lock lockD = new ReentrantLock();
    private final Vector<Object> container = new Vector<>();
    private final Object obj = new Object();

    public void lockCThenD() {
        lockC.lock();
        try {
            lockD.lock();
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockD.unlock();
            }
        } finally {
            lockC.unlock();
        }
    }

    public void lockDThenC() {
        lockD.lock();
        try {
            lockC.lock();
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockC.unlock();
            }
        } finally {
            lockD.unlock();
        }
    }

    public void lockCThenAddToContainer() {
        lockC.lock();
        try {
            container.add(obj); // BUG: DEADLOCK
        } finally {
            lockC.unlock();
        }
    }

    public void lockContainerThenC() {
        synchronized (container) {
            lockC.lock();
            try {
                // do something with both resources // BUG: DEADLOCK
            } finally {
                lockC.unlock();
            }
        }
    }

    // Demonstrate the bug
    public void showBug() {
        Thread thread1 = new Thread(this::lockCThenD);
        Thread thread2 = new Thread(this::lockDThenC);
        thread1.start();
        thread2.start();
    }
}