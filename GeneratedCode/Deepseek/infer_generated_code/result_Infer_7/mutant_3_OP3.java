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
        vector.add("object");
        synchronized(lockA) {
            // do something with both resources
        }
    }

    // MUTANT: UNREACHABLE IF STATEMENT
    public void showMutant() {
        Thread thread1 = new Thread(this::addToVectorThenLockA);
        Thread thread2 = new Thread(this::lockVectorThenA);
        thread1.start();
        if (false) {
            // unreachable code
            int x = 1; 
        }
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}