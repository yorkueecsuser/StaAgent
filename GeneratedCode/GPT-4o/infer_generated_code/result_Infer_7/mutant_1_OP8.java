import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    // Original method
    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        }
    }

    // Mutant method with renamed variable
    public void lockAThenAddToVectorMutant() {
        synchronized (lockA) {
            Vector<Object> v = vector; // Renaming vector to v
            v.add(new Object());
        }
    }

    // Original method
    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
    }

    // Mutant method with renamed variable
    public void lockVectorThenAMutant() {
        synchronized (vector) { // BUG: DEADLOCK
            Object l = lockA; // Renaming lockA to l
            synchronized (l) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
    }

    // Original method
    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
    
    // Mutant method with updated thread calls
    public void showBugMutant() {
        Thread thread1 = new Thread(this::lockAThenAddToVectorMutant);
        Thread thread2 = new Thread(this::lockVectorThenAMutant);

        thread1.start();
        thread2.start();
    }
}