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

// Mutant 1: Duplicate assignment statement
public void lockAThenB() {
    synchronized(lockA) {
        synchronized(lockB) {
            // do something with both resources
        }
    }
    synchronized(lockA) {
        synchronized(lockB) {
            // do something with both resources
        }
    }
}

// Mutant 2: Duplicate assignment statement
public void lockBThenA() {
    synchronized(lockB) {
        synchronized(lockA) {
            // do something with both resources
        }
    }
    synchronized(lockB) {
        synchronized(lockA) {
            // do something with both resources
        }
    }
}

// Mutant 3: Duplicate assignment statement
public void lockAThenAddToVector() {
    synchronized(lockA) {
        vector.add(new Object());
    }
    synchronized(lockA) {
        vector.add(new Object());
    }
}

// Mutant 4: Duplicate assignment statement
public void lockVectorThenA() {
    synchronized(vector) {
        synchronized(lockA) {
            // do something with both resources
        }
    }
    synchronized(vector) {
        synchronized(lockA) {
            // do something with both resources
        }
    }
}