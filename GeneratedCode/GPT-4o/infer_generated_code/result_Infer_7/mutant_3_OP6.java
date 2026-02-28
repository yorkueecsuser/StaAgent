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

                // Unreachable for loop added as a mutant
                boolean conditionFor = getCondition(); // Using a non-final method call to avoid compile-time constant
                for (int i = 0; conditionFor; i++) {
                    // This block is unreachable
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

    // Helper method to provide a non-final condition
    private boolean getCondition() {
        return false; // Ensures the loop is unreachable
    }
}