import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
                boolean condition = getCondition(); // Non-final variable for unreachable code
                if (condition) {
                    System.out.println("This branch is unreachable.");
                } else {
                    System.out.println("This branch will always execute.");
                }
            }
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }

    // Method to simulate a runtime condition, always returns false
    private boolean getCondition() {
        return false;
    }
}