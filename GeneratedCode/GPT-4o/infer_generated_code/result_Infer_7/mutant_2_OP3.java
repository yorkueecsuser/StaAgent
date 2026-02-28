import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();
    private boolean condition = false; // Used for unreachable if statement

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        }
        
        // Unreachable if statement inserted
        if (condition) {
            System.out.println("This is unreachable code inside lockAThenAddToVector.");
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
        
        // Unreachable if statement inserted
        if (condition) {
            System.out.println("This is unreachable code inside lockVectorThenA.");
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
}