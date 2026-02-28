import com.facebook.infer.annotation.ThreadSafe;
import java.util.Vector;

@ThreadSafe
class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenB() {
        synchronized (lockA) {
            synchronized (lockB) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void lockBThenA() {
        synchronized (lockB) {
            synchronized (lockA) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object()); // BUG: DEADLOCK
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) {
            synchronized (lockA) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(() -> lockAThenB()); // BUG: DEADLOCK
        Thread thread2 = new Thread(() -> lockBThenA()); // BUG: DEADLOCK

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void showBug2() {
        Thread thread1 = new Thread(() -> lockAThenAddToVector()); // BUG: DEADLOCK
        Thread thread2 = new Thread(() -> lockVectorThenA()); // BUG: DEADLOCK

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Mutated code
    private final Object x = new Object();
    private final Object y = new Object();
    private final Vector<Object> z = new Vector<>();

    public void lockXThenY() {
        synchronized (x) {
            synchronized (y) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void lockYThenX() {
        synchronized (y) {
            synchronized (x) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void lockXThenAddToZ() {
        synchronized (x) {
            z.add(new Object()); // BUG: DEADLOCK
        }
    }

    public void lockZThenX() {
        synchronized (z) {
            synchronized (x) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void showMutantBug() {
        Thread t1 = new Thread(() -> lockXThenY()); // BUG: DEADLOCK
        Thread t2 = new Thread(() -> lockYThenX()); // BUG: DEADLOCK

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void showMutantBug2() {
        Thread t1 = new Thread(() -> lockXThenAddToZ()); // BUG: DEADLOCK
        Thread t2 = new Thread(() -> lockZThenX()); // BUG: DEADLOCK

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}