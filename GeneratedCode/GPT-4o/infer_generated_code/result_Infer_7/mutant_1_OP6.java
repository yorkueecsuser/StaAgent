import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        }
        
        // Unreachable for loop inserted in lockAThenAddToVector
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
        
        // Unreachable for loop inserted in lockVectorThenA
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
    
    // Helper method to provide a dynamic condition for loops
    private boolean getCondition() {
        return false; // This makes the loop condition false dynamically
    }
}