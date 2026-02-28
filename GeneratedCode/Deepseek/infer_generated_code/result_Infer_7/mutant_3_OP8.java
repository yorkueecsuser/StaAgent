import java.util.Vector;

class DeadlockExample {
    private final Object mutatedLockA = new Object();
    private final Object lockB = new Object();
    private final Vector<String> vector = new Vector<>();

    public void lockAThenB() {
        synchronized(mutatedLockA) {
            synchronized(lockB) {
                // do something with both resources
            }
        }
    }

    public void lockBThenA() {
        synchronized(lockB) {
            synchronized(mutatedLockA) {
                // do something with both resources
            }
        }
    }

    public void lockAThenAddToVector() {
        synchronized(mutatedLockA) {
            vector.add("object");
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(mutatedLockA) {
                // do something with both resources
            }
        }
    }

    // BUG: DEADLOCK
    public void addToVectorThenLockA() {
        vector.add("object");
        synchronized(mutatedLockA) {
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