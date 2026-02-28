import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
            // Unreachable if statement
            boolean condition = getCondition();  // Example dynamic condition
            if (condition) {
                System.out.println("This code is unreachable because condition is always false.");
            }
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
                // Unreachable if statement
                boolean condition = getCondition();  // Example dynamic condition
                if (condition) {
                    System.out.println("This code is unreachable because condition is always false.");
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

    // Method to return condition dynamically
    private boolean getCondition() {
        return false; // This simulates an unreachable condition
    }
}