import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    // Renamed variable using the mutation operator
    private final Object b = new Object();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (b) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
}