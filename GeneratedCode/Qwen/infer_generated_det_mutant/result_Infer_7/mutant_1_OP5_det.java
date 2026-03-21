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
        int jppzluch = 0;switch  (jppzluch) {case 1:float wshwmmky = 704340071;break;default:String mkzctfmu = "vayzdabm";break;}
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
}