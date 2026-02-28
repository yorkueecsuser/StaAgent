import java.util.Vector;

class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private Vector<Object> vector = new Vector<>();

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
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void showBug() {
        lockAThenB();
        lockBThenA();
        lockAThenAddToVector();
        lockVectorThenA();
    }
}

// Mutant 1: Replace for loop with do-while loop
class DeadlockExampleMutant1 {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private Vector<Object> vector = new Vector<>();

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
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void showBug() {
        lockAThenB();
        lockBThenA();
        do {
            lockAThenAddToVector();
        } while (vector.size() > 0);
        lockVectorThenA();
    }
}

// Mutant 2: Replace while loop with do-while loop
class DeadlockExampleMutant2 {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private Vector<Object> vector = new Vector<>();

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
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void showBug() {
        lockAThenB();
        lockBThenA();
        do {
            lockVectorThenA();
        } while (vector.size() > 0);
        lockAThenAddToVector();
    }
}