import java.util.Vector;

class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private final Vector<String> vector = new Vector<>();

    public void lockAThenB() {
        synchronized(lockA) {
            synchronized(lockB) {
                // do something with both resources
            }
        }
    }

    public void lockBThenA() {
        synchronized(lockB) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void lockAThenAddToVector() {
        synchronized(lockA) {
            vector.add("object");
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    // BUG: DEADLOCK
    public void addToVectorThenLockA() {
        String deadStore = ""; // Dead store mutant
        vector.add("object");
        synchronized(lockA) {
            // do something with both resources
        }
    }

    // BUG: DEADLOCK
    public String showBug() {
        Thread thread1 = new Thread(this::addToVectorThenLockA);
        Thread thread2 = new Thread(this::lockVectorThenA);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Deadlock occurred";
    }
}