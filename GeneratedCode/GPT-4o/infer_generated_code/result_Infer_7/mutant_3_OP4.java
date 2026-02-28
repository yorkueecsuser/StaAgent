import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        // Introduce an unreachable if-else statement
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // This block will not be executed if condition is always false
            System.out.println("This is an unreachable branch");
        } else {
            synchronized (lockA) {
                vector.add(new Object());
            }
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
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
    
    // Method to get a condition, which is always false
    private boolean getCondition() {
        return false;
    }
}