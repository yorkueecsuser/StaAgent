import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    private boolean getCondition() {
        return false;
    }

    public void lockAThenAddToVector() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
        synchronized (lockA) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
    }

    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
}