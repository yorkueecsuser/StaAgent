import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
        }
        synchronized (lockA) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This is an unreachable while loop
            }
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
        }
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }

    private boolean getCondition() {
        return false; // The condition is always false
    }
}