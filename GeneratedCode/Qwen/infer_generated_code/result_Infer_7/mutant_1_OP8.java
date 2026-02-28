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
    private final Object a = new Object();
    private final Object b = new Object();
    private final Vector<Object> v = new Vector<>();

    public void lockAThenB_mutant() {
        synchronized (a) {
            synchronized (b) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void lockBThenA_mutant() {
        synchronized (b) {
            synchronized (a) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void lockAThenAddToVector_mutant() {
        synchronized (a) {
            v.add(new Object()); // BUG: DEADLOCK
        }
    }

    public void lockVectorThenA_mutant() {
        synchronized (v) {
            synchronized (a) {
                // do something with both resources // BUG: DEADLOCK
            }
        }
    }

    public void showBug_mutant() {
        Thread t1 = new Thread(() -> lockAThenB_mutant()); // BUG: DEADLOCK
        Thread t2 = new Thread(() -> lockBThenA_mutant()); // BUG: DEADLOCK

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void showBug2_mutant() {
        Thread t1 = new Thread(() -> lockAThenAddToVector_mutant()); // BUG: DEADLOCK
        Thread t2 = new Thread(() -> lockVectorThenA_mutant()); // BUG: DEADLOCK

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